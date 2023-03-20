package com.example.toasterlibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MyToast
import com.example.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterMessage.s(this,"Welcome to the app.")
        MyToast.showToast(this,"Welcome to the app.")


    }
}