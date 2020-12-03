package michaelrodyushkin.honorsmobileapps.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private SnapAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.RecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        ArrayList<Snap> snaps = new ArrayList<>();
        snaps.add(new Snap("Joe", R.drawable.ic_airplanemode_inactive_black_24dp, "2m"));
        snaps.add(new Snap("TinkTheTank", R.drawable.ic_attach_money_black_24dp, "20m"));
        snaps.add(new Snap("FreakyRahique'e", R.drawable.ic_delete_black_24dp, "3yr"));
        mAdapter = new SnapAdapter(snaps);
        mRecyclerView.setAdapter(mAdapter);

    }
}
