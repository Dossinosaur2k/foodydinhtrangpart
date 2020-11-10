package com.example.foody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<CountriesModel> countriesData;
    LayoutInflater layoutInflater;
    CountriesModel countriesModel;

    public CustomAdapter(Context context, ArrayList<CountriesModel> countriesData) {
        this.context = context;
        this.countriesData = countriesData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return countriesData.size();
    }

    @Override
    public Object getItem(int i) {
        return countriesData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return countriesData.get(i).getId();
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row, null, true);
        }
        //link views
        ImageView anhsp = rowView.findViewById(R.id.anhsp);
        TextView tencuahang = rowView.findViewById(R.id.tenquan);
        TextView tensp = rowView.findViewById(R.id.tensp);
        TextView diachi = rowView.findViewById(R.id.diachi);
        TextView ngaythang = rowView.findViewById(R.id.ngaythang);

        countriesModel = countriesData.get(position);

        anhsp.setImageResource(countriesModel.getImg());
        tencuahang.setText(countriesModel.getTencuahang());
        tensp.setText(countriesModel.getTensp());
        diachi.setText(countriesModel.getDiachi());
        ngaythang.setText(countriesModel.getNgaythang());

        return rowView;
    }
}