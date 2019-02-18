package com.anh.asign13.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnOK;
    private Button btnStop;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        intent= new Intent(this, MyService.class);
    }

    private void initViews() {
        btnOK = (Button) findViewById(R.id.btnOK);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnOK.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if ( id== R.id.btnOK){
            //showMessage("My service was started");

            Bundle bundle= new Bundle();
            bundle.putInt("StuID",1);
            bundle.putString("StuName","Lưu Đức Anh");
            bundle.putString("Class","pt14151MOB");

            intent.putExtra("student", bundle);
            startService(intent);
        } else if (id== R.id.btnStop){
            showMessage("My Service was Stopped");
            stopService(intent);
        }
    }
    public void showMessage (String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

    }
}
