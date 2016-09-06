package info.devexchanges.snaprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> items;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        createApps();

        /**
         * Center snapping
         */
        //SnapHelper snapHelper = new LinearSnapHelper();
        //snapHelper.attachToRecyclerView(recyclerView);

        /**
         * Start snapping
         */
        //SnapHelper snapHelper = new GravitySnapHelper(Gravity.START);
        //snapHelper.attachToRecyclerView(recyclerView);

        /**
         * End snapping
         */
        //SnapHelper snapHelper = new GravitySnapHelper(Gravity.END);
        //snapHelper.attachToRecyclerView(recyclerView);

        /**
         * Top snapping
         */
        //SnapHelper snapHelper = new GravitySnapHelper(Gravity.TOP);
        //snapHelper.attachToRecyclerView(recyclerView);

        /**
         * Bottom snapping
         */
        SnapHelper snapHelper = new GravitySnapHelper(Gravity.BOTTOM);
        snapHelper.attachToRecyclerView(recyclerView);

        // HORIZONTAL for Gravity START/END and VERTICAL for TOP/BOTTOM
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);

        SnapRecyclerAdapter adapter = new SnapRecyclerAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }

    private void createApps() {
        items = new ArrayList<>();
        items.add(new Item("Google+", R.drawable.google_plus));
        items.add(new Item("Facebook", R.drawable.facebook));
        items.add(new Item("LinkedIn", R.drawable.linkedin));
        items.add(new Item("Youtube", R.drawable.youtube));
        items.add(new Item("Instagram", R.drawable.instagram));
        items.add(new Item("Skype", R.drawable.skype));
        items.add(new Item("Twitter", R.drawable.twitter));
        items.add(new Item("Wikipedia", R.drawable.wikipedia));
        items.add(new Item("Whats app", R.drawable.what_apps));
        items.add(new Item("Pokemon Go", R.drawable.pokemon_go));
    }
}
