package Tuan2_Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sum.R

class Kintent2 : AppCompatActivity() {
    var tv1: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kintent2)
        tv1=findViewById(R.id.KI2tv1)
        var i1=intent
        val chuoi1=i1.extras!!.getString("so1")
        val chuoi2=i1.extras!!.getString("so2")
        var so1=chuoi1!!.toFloat()
        val so2=chuoi2!!.toFloat()
        val tong = so1+so2
        tv1!!.text=tong.toString()
    }
}