package com.anant.textchangeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtHello:TextView
    lateinit var btnClick:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtHello=findViewById(R.id.txtHello)
        btnClick=findViewById(R.id.btnClick)


        var x=1;
        btnClick.setOnClickListener {
            Toast.makeText(applicationContext,"Refreshing...",Toast.LENGTH_SHORT).show()
            if(x==1) {
                x=0;
                txtHello.text = "RA1911003010323"
            }
            else if(x==0) {
                txtHello.text = "Hello"
                x=1;
            }
        }



    }
}