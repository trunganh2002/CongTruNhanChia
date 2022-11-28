package com.example.congtrunhanchia_hai137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<String> list = new ArrayList<>();

        list.add("Phép Cộng");
        list.add("Phép Trừ");
        list.add("Phép Nhân");
        list.add("Phép Chia");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(MainActivity.this,Cong.class));
                }else if (i==1){
                    startActivity(new Intent(MainActivity.this,Tru.class));
                }else if (i==2){
                    startActivity(new Intent(MainActivity.this,Nhan.class));
                }else if (i==3){
                    startActivity(new Intent(MainActivity.this,Chia.class));
                }
            }
        });
    }
}