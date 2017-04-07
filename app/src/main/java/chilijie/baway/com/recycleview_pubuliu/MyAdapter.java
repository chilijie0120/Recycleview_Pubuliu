package chilijie.baway.com.recycleview_pubuliu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MacBook- on 2017/4/7.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Shop> shops;
    private Context context;
    private List<Integer> mheight;
    public MyAdapter(List<Shop> shops, Context context) {
        this.shops = shops;
        this.context = context;
        mheight=new ArrayList<Integer>();
        for(int i=0;i<shops.size();i++){
            mheight.add((int)(100+Math.random()*300));
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view=View.inflate(context,R.layout.recycleview_item,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewGroup.LayoutParams lp = viewHolder.iv.getLayoutParams();
        lp.height=mheight.get(i);
        viewHolder.iv.setLayoutParams(lp);
        viewHolder.tv.setText(shops.get(i).getInfo().getLoupan_name());
        Glide.with(context).load(shops.get(i).getInfo().getDefault_image()).into(viewHolder.iv);
    }

    @Override
    public int getItemCount() {
        return shops.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            iv= (ImageView) itemView.findViewById(R.id.iv);
            tv= (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
