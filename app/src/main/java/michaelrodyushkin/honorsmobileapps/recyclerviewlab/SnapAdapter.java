package michaelrodyushkin.honorsmobileapps.recyclerviewlab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SnapAdapter extends RecyclerView.Adapter<SnapViewHolder> {
    private ArrayList<Snap> mSnaps;
    public SnapAdapter(ArrayList<Snap> snaps) {
        mSnaps = snaps;
    }
    @Override
    public SnapViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.listitem_layout, parent, false);
        SnapViewHolder newViewHolder = new SnapViewHolder(rootView);
        return newViewHolder;
    }
    @Override
    public void onBindViewHolder(SnapViewHolder currentViewHolder, int position) {
        Snap currentSnap = mSnaps.get(position);
        currentViewHolder.bindSnap(currentSnap);
    }
    @Override
    public int getItemCount() {
        return mSnaps.size();
    }
}
