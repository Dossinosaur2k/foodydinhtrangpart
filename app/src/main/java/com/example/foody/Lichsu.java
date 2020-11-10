package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Lichsu extends AppCompatActivity {
    private Spinner spinnerEmployee;
    private TextView ngaytruoc,ngaysau;
    ListView listView;
    Context context;
    CustomAdapter customAdapter;
    ArrayList<CountriesModel> countriesData;
    CountriesModel countriesModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichsu);
        this.spinnerEmployee = (Spinner) findViewById(R.id.spinner);
        Employee[] employees = EmployeeDataUtils.getEmployees();

        // (@resource) android.R.layout.simple_spinner_item:
        //   The resource ID for a layout file containing a TextView to use when instantiating views.
        //    (Layout for one ROW of Spinner)
        ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(this,
                android.R.layout.simple_spinner_item,
                employees);

        // Layout for All ROWs of Spinner.  (Optional for ArrayAdapter).
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        this.spinnerEmployee.setAdapter(adapter);

        // When user select a List-Item.
        this.spinnerEmployee.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                onItemSelectedHandler(parent, view, position, id);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //lịch
        ngaytruoc = (TextView) findViewById(R.id.ngaytruoc);
        ngaysau = (TextView) findViewById(R.id.ngaysau);
        //set ngay truoc va sau
        layngay();
        ngaytruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chonngay();
            }
        });
        ngaysau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chonngaysau();
            }
        });
        //List
        //ListView
        //-getview
        listView = findViewById(R.id.list);
        countriesData = new ArrayList<>();

        //addlichsudata
        LichsuaddData();
        context = this;
            customAdapter = new CustomAdapter(context, countriesData);
            listView.setAdapter(customAdapter);

        //setsukien
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            }
        });


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
    private void layngay(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
        ngaytruoc.setText(simpleDateFormat.format(calendar.getTime()));
        ngaysau.setText(simpleDateFormat.format(calendar.getTime()));
    }

    //chon ngay void
    private void chonngay(){
        final Calendar calendar = Calendar.getInstance();
        int ngay = calendar.get(Calendar.DATE);
        int thang = calendar.get(Calendar.MONTH);
        int nam = calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year,month,dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
                ngaytruoc.setText(simpleDateFormat.format(calendar.getTime()));
            }
        },nam,thang,ngay);
        datePickerDialog.show();
    }
    private void chonngaysau(){
        final Calendar calendar = Calendar.getInstance();
        int ngay = calendar.get(Calendar.DATE);
        int thang = calendar.get(Calendar.MONTH);
        int nam = calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year,month,dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
                ngaysau.setText(simpleDateFormat.format(calendar.getTime()));
            }
        },nam,thang,ngay);
        datePickerDialog.show();
    }
    private void onItemSelectedHandler(AdapterView<?> adapterView, View view, int position, long id) {
        Adapter adapter = adapterView.getAdapter();
        Employee employee = (Employee) adapter.getItem(position);

        Toast.makeText(getApplicationContext(), "Chọn : " + employee.getFirstName() ,Toast.LENGTH_SHORT).show();
    }

}

