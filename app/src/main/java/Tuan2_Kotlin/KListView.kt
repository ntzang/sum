package Tuan2_Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.sum.R

class KListView : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klist_view)
        lv=findViewById(R.id.klist1)
        //nguon du lieu
        val arr = arrayOf("item", "item 2", "item 3", "so 4","so 5", "so 6", "so 7" )
        //adapter
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        //hien thi len listview
        lv!!.adapter=adapter;
    }
}