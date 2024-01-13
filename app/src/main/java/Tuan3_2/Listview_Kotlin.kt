package Tuan3_2

import Tuan3.T32Contact
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.sum.R

class Listview_Kotlin : AppCompatActivity() {
    var adap: T312Adapter? = null
    var ls:ArrayList<T32Contact> = ArrayList()
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_kotlin)
        var lv=findViewById<ListView>(R.id.tuan32lv)//anh xa
        //tao nguon du lieu
        ls.add(T32Contact("Nguyen Van A","18",R.drawable.android))
        ls.add(T32Contact("Nguyen Van B","19",R.drawable.apple))
        ls.add(T32Contact("Nguyen Van C","20",R.drawable.blogger))
        ls.add(T32Contact("Nguyen Van D","21",R.drawable.border))
        ls.add(T32Contact("Nguyen Van E","22",R.drawable.chrome))
        //gan vao adapter
        adap= T312Adapter(this,ls)
        lv.adapter=adap
    }
}