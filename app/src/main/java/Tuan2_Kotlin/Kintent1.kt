package Tuan2_Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.sum.R

class Kintent1 : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kintent1)
        txt1=findViewById(R.id.KItv1)
        txt2=findViewById(R.id.KItv2)
        btn1=findViewById(R.id.KIbtn1)
        btn1!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@Kintent1, Kintent2::class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
        })
    }
}