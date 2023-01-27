package com.seeksolution.autoimagesilders.Adatpers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.seeksolution.autoimagesilders.Models.SliderModel;
import com.seeksolution.autoimagesilders.R;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SliderMainAdapter extends SliderViewAdapter<SliderMainAdapter.MyView>{

    private Context context;
    private ArrayList<SliderModel> arrayList = new ArrayList<>();

    public SliderMainAdapter(Context context, ArrayList<SliderModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_custom_sliders,parent,false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(MyView viewHolder, int position) {
        Picasso.get().load(arrayList.get(position).getUrls()).into(viewHolder.imageView);

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    public class MyView extends ViewHolder {
        public ImageView imageView;
        public MyView(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_sliders);
        }
    }
}
