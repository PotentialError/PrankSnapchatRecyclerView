package michaelrodyushkin.honorsmobileapps.recyclerviewlab;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class SnapViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private ImageView mProfilePic;
    private TextView mProfileName;
    private ImageView mStatusPic;
    private TextView mStatusName;
    private TextView mTime;
    private Snap mSnap;
    public SnapViewHolder(View rootView) {
        super(rootView);
        rootView.setOnClickListener(this);
        mProfilePic = rootView.findViewById(R.id.profilePic);
        mProfileName = rootView.findViewById(R.id.profileName);
        mStatusPic = rootView.findViewById(R.id.statusSymbol);
        mStatusName = rootView.findViewById(R.id.statusName);
        mTime = rootView.findViewById(R.id.time);
    }
    public void bindSnap(Snap snap) {
        mSnap = snap;
        mProfilePic.setImageResource(mSnap.getProfilePictureID());
        mProfileName.setText(mSnap.getUsername());
        mStatusPic.setImageResource(mSnap.getStatusImage());
        mTime.setText(mSnap.getTime());
        mStatusName.setText(mSnap.getStatusText());
        mStatusName.setTextColor(mSnap.getStatusTextColor());
    }
    public void setSnapStatus() {
        mSnap.isOpen(true);
        mStatusName.setText(mSnap.getStatusText());
        mStatusName.setTextColor(mSnap.getStatusTextColor());
        mStatusPic.setImageResource(mSnap.getStatusImage());
    }
    public void onClick(View v) {
        setSnapStatus();
        Intent intent = new Intent(v.getContext(), PrankSnapActivity.class);
        v.getContext().startActivity(intent);
    }
}
