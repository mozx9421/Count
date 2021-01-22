package com.example.count_fei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast_error_add = Toast.makeText(applicationContext,"Can't add the more value",Toast.LENGTH_LONG)
        val toast_error_minus = Toast.makeText(applicationContext,"Can't reduce the value",Toast.LENGTH_LONG)
        var countnum = 0

        Count.setOnClickListener(){
            if (countnum <= 8 && countnum >= 0 ){
            countnum++
            var textcount = findViewById<TextView>(R.id.textcount)
            textcount.setText("You clicked $countnum times!")
            }
            else{
                toast_error_add.show()
            }
        }
        Minus.setOnClickListener(){
            if (countnum > 0){
               countnum = countnum - 1
                textcount.setText("You clicked $countnum times!")
            }
            else{
                toast_error_minus.show()

            }
        }
        Reset.setOnClickListener(){
            countnum = 0
            textcount.setText("You clicked $countnum times!")
            var toastreset = Toast.makeText(applicationContext,"Reset value",Toast.LENGTH_LONG)
            toastreset.show()
        }
    }
}