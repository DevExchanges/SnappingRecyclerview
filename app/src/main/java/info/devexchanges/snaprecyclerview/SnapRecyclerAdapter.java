package info.devexchanges.snaprecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SnapRecyclerAdapter extends RecyclerView.Adapter<SnapRecyclerAdapter.ReyclerViewHolder> {

    private LayoutInflater layoutInflater;
    private Context context;
    private ArrayList<App> apps;

    public SnapRecyclerAdapter(Context context, ArrayList<App> apps) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.apps = apps;
    }

    @Override
    public ReyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = layoutInflater.inflate(R.layout.item_recycler_view, parent, false);

        return new ReyclerViewHolder(item);
    }

    @Override
    public void onBindViewHolder(final ReyclerViewHolder holder, int position) {
        App app = apps.get(position);

        holder.image.setImageResource(app.getDrawable());
        holder.appName.setText(app.getName());
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    class ReyclerViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView appName;

        private ReyclerViewHolder(final View v) {
            super(v);

            image = (ImageView) v.findViewById(R.id.image);
            appName = (TextView) v.findViewById(R.id.app_name);
        }
    }
}
