package com.example.foody;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Fragmentdonnhap extends Fragment {
    View V;
    ListView listView;
    Context context;
    CustomAdapter customAdapter;
    ArrayList<CountriesModel> countriesData;
    CountriesModel countriesModel;
    public Fragmentdonnhap(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       V = inflater.inflate(R.layout.donnhap,container,false);
        listView = V.findViewById(R.id.list_donnhap);
        countriesData = new ArrayList<>();
        LichsuaddData();
        context = this.getActivity();
        customAdapter = new CustomAdapter(context, countriesData);
        listView.setAdapter(customAdapter);

        //setsukien
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            }
        });
        return V;
    }
    private void LichsuaddData() {
        //food1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
        //food2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
        //food3
        countriesModel = new CountriesModel();
        countriesModel.setId(3);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
        //food4
        countriesModel = new CountriesModel();
        countriesModel.setId(4);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
        //food5
        countriesModel = new CountriesModel();
        countriesModel.setId(5);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
        //food6
        countriesModel = new CountriesModel();
        countriesModel.setId(6);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
        //food7
        countriesModel = new CountriesModel();
        countriesModel.setId(7);
        countriesModel.setImg(R.drawable.gongcha);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesData.add(countriesModel);
    }
}
