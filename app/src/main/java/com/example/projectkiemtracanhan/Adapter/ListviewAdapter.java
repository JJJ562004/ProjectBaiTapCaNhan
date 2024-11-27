package com.example.projectkiemtracanhan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectkiemtracanhan.Item;
import com.example.projectkiemtracanhan.R;

import java.util.List;

public class ListviewAdapter extends BaseAdapter {

    private Context context;
    private List<Item> itemlist;

    public ListviewAdapter(Context context, List<Item> itemlist) {
        this.context = context;
        this.itemlist = itemlist;
    }

    @Override
    public int getCount() {
        return itemlist.size();
    }

    @Override
    public Object getItem(int position) {
        return itemlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.listview_item_block, parent, false);

        ImageView itemImage = convertView.findViewById(R.id.item_image);
        TextView textview_name = convertView.findViewById(R.id.name);
        TextView textview_quant = convertView.findViewById(R.id.quant);
        TextView textview_qual = convertView.findViewById(R.id.qual);
        Button btn_buy = convertView.findViewById(R.id.buy_now_button);
        Item item = itemlist.get(position);

        itemImage.setImageResource(item.getImageID());
        textview_name.setText(String.valueOf(item.getName()));
        textview_qual.setText(String.valueOf(item.getQual()));
        textview_quant.setText(String.valueOf(item.getQuant()));

        btn_buy.setOnClickListener(v ->
                Toast.makeText(context, "Bạn đã mua " + item.getName(), Toast.LENGTH_SHORT).show()
        );

        return convertView;
    }
}
