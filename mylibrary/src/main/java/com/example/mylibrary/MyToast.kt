package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class MyToast {
    companion object{
        fun showToast(c: Context?, message:String){
            Toast.makeText(c,message,Toast.LENGTH_LONG).show()
        }
    }
}