package com.example.congtrunhanchia_hai137;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Chia extends AppCompatActivity {
    private EditText editSoA,editSoB,editKQ;
    private Button btnTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chia);
        AddControl();
        AddEvent();
    }
    private void AddControl(){
        editSoA = findViewById(R.id.editSoa);
        editSoB = findViewById(R.id.editSob);
        editKQ = findViewById(R.id.editKQ);

        btnTinh = findViewById(R.id.btnTinh);
    }
    private void AddEvent(){
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kq = Double.parseDouble(editSoA.getText().toString()) / Double.parseDouble(editSoB.getText().toString());
                editKQ.setText(String.valueOf(kq));
            }
        });
    }
}