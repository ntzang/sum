package tuan6_kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sum.R

class Tuan612MainActivity : AppCompatActivity() {
    var btn: Button?=null
    var tvkq:TextView?=null
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan612_main)
        btn=findViewById(R.id.tuan612btn)
        tvkq=findViewById(R.id.tuan612tvkq)
        val fn=VolleyKotlinFn()
        btn!!.setOnClickListener{
            fn.getJSON_ArrayObjects(context,tvkq!!)
        }
    }
}