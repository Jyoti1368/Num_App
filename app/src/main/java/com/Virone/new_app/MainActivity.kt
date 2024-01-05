package com.Virone.new_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button

    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_minus)
        btnDivide = findViewById(R.id.btn_divide)
        btnMultiply = findViewById(R.id.btn_multiply)

        etA = findViewById(R.id.lio)
        etB = findViewById(R.id.lio2)
        resultTv = findViewById(R.id.resultTv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when (v?.id) {
            R.id.btn_add -> {
                result = a + b
            }
            R.id.btn_minus -> {
                result = a - b
            }
            R.id.btn_multiply -> {
                result = a * b
            }
            R.id.btn_divide -> {
                result = a / b
            }
        }
        resultTv.text = "Result is $result"
    }
}
