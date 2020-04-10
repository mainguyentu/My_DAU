package com.example.my_dau_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhap_Activity extends AppCompatActivity {

    EditText txtID,txtPass;
    Button btnAccepct;
    String id,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap_);

        Anhxa();

//        id=txtID.getText().toString();
//        pass=txtPass.getText().toString();

        btnAccepct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Checked();
            }
        });
    }
    public void Anhxa(){
        txtID = findViewById(R.id.txtID);
        txtPass = findViewById(R.id.txtPass);
        btnAccepct = findViewById(R.id.btnAccepct);
    }
    public void putData(){
        Intent it = new Intent(DangNhap_Activity.this, MainActivity_v2.class);
        Bundle bundle = new Bundle();
        bundle.putString("uid",id);
        bundle.putString("pass",pass);
        it.putExtra("data",bundle);
        startActivity(it);
    }
    public void Checked(){
        if((txtID.equals("") || txtPass.equals(""))||(txtID.equals("") && txtPass.equals(""))){
            Toast.makeText(DangNhap_Activity.this, "Bạn cần nhập đầy đủ thông tin đăng nhập !", Toast.LENGTH_SHORT).show();
        }else{
            putData();
            Toast.makeText(DangNhap_Activity.this, "Bạn đã đăng nhập thành công !", Toast.LENGTH_SHORT).show();
        }
    }
}
