package com.lotus.kotlindevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var stringvalue:String;
    lateinit var button: Button;
    lateinit var editText: EditText;
    lateinit var textView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.text)

        var list: ArrayList<String> = ArrayList();

        button.setOnClickListener(View.OnClickListener {
            stringvalue = editText.text.toString();

            textView.setText(stringvalue);
            list.add(stringvalue)

            val intent = Intent(this, workloadScreen::class.java)
            startActivity(intent);

        })


    }
}