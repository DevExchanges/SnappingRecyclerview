package info.devexchanges.snaprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<App> apps;
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

        SnapRecyclerAdapter adapter = new SnapRecyclerAdapter(this, apps);
        recyclerView.setAdapter(adapter);
    }

    private void createApps() {
        apps = new ArrayList<>();
        apps.add(new App("Google+", R.drawable.google_plus));
        apps.add(new App("Facebook", R.drawable.facebook));
        apps.add(new App("LinkedIn", R.drawable.linkedin));
        apps.add(new App("Youtube", R.drawable.youtube));
        apps.add(new App("Instagram", R.drawable.instagram));
        apps.add(new App("Skype", R.drawable.skype));
        apps.add(new App("Twitter", R.drawable.twitter));
        apps.add(new App("Wikipedia", R.drawable.wikipedia));
        apps.add(new App("Whats app", R.drawable.what_apps));
        apps.add(new App("Twitter", R.drawable.pokemon_go));
    }
}
