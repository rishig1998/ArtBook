package com.example.artbook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            val mydatabase=this.openOrCreateDatabase("Musicions",Context.MODE_PRIVATE,null)
             mydatabase.execSQL("CREATE TABLE IF NOT EXISTS musicion(name VARCHAR,age INT(2)) ")
            mydatabase.execSQL("insert into musicion(name,age)values ('rishi',12) ")

        }catch (e:Exception)
        {
            e.printStackTrace()
        }
    }
}