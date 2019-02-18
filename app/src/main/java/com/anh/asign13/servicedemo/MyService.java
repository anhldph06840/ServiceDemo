package com.anh.asign13.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(this,"My Service was start", Toast.LENGTH_SHORT).show();
        Bundle bundle= intent.getBundleExtra("student");
        int id= bundle.getInt("StuID");
        String name= bundle.getString("StuName");
        String clas = bundle.getString("Class");
        String content="Thêm sinh viên thành công. \n Thông tin sinh viên: \n Sinh viên: "+ id + name;
        content= content+ "\n Lớp: "+ clas;
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }
}
