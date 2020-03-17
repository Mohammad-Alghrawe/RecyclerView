package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerview.modelclass.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelClass> modelClassArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelClassArrayList = new ArrayList<>();
        addItems();
    }


    private void addItems(){
        try {
                for (int i = 0; i<20; i++){
                    modelClassArrayList.add(new ModelClass(
                            R.drawable.smile,
                            "Name :" + i,
                            "Email : " + i
                    ));
                }

        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
