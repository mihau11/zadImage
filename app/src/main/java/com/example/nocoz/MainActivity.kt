package com.example.nocoz

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p=1
        var x=0
        var y=0f
        findViewById<Button>(R.id.prev).setOnClickListener {
            p--
            if(p<1){p=5}
            if(p==1){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kanapa)}
            else if(p==2){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kanap)}
            else if(p==3){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kana)}
            else if(p==4){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kan)}
            else{findViewById<ImageView>(R.id.im).setImageResource(R.drawable.ka)}
    }
        findViewById<Button>(R.id.prev).setOnClickListener {
            p++
            if(p>5){p=1}
            if(p==1){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kanapa)}
            else if(p==2){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kanap)}
            else if(p==3){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kana)}
            else if(p==4){findViewById<ImageView>(R.id.im).setImageResource(R.drawable.kan)}
            else{findViewById<ImageView>(R.id.im).setImageResource(R.drawable.ka)}
        }
        findViewById<Button>(R.id.obrot).setOnClickListener {
            x = findViewById<EditText>(R.id.cin).text.toString().toInt()
            findViewById<ImageView>(R.id.im).setRotationY(findViewById<ImageView>(R.id.im).rotationY + x)
        }
        findViewById<CheckBox>(R.id.check).setOnClickListener {
            if(findViewById<CheckBox>(R.id.check).isChecked){findViewById<ImageView>(R.id.im).alpha=1f}
            else {findViewById<ImageView>(R.id.im).alpha=0f}
        }
        findViewById<Button>(R.id.przez).setOnClickListener {
            y = findViewById<EditText>(R.id.cin2).text.toString().toFloat()
            if(y>=0 && y<=100f){y/=100}
            findViewById<ImageView>(R.id.im).alpha=y
        }

}}