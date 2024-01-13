package Tuan3_2

import Tuan3.T32Contact
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sum.R

class T312Adapter(context: Context, ls:ArrayList<T32Contact>): BaseAdapter() {
    var ls: ArrayList<T32Contact> = ls
    var context: Context = context

    //Lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }

    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }

    //lay ve id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //TAO VIEW
    //gan du lieu cho view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //1. tao view

        var vax: ViewAX
        //1.1/ Neu chua co view -> taoj view moi
        if (convertView == null) {
            vax = ViewAX()//taoviewmoi
            //generate layout
            c = LayoutInflater.from(context).inflate(R.layout.t3kotlin_lview, null)
            //anh xa tung thanh phan
            vax.img_hinh = c.findViewById(R.id.tuan312ItemHinh)
            vax.tv_ten = c.findViewById(R.id.tuan312ItemTen)
            vax.tv_tuoi = c.findViewById(R.id.tuan312ItemTuoi)
            //tao template de lan sau su dung
            c.tag = vax
        }
        //1.2 Neu da co view -> sd view cu
        else {
            vax = c!!.tag as ViewAX
        }
        //2.gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh)
        vax.tv_ten!!.text = ls[position].ten!!
        vax.tv_tuoi!!.text = ls[position].tuoi!!
        return c!!
    }

    //khai bao lop anh xa ItemView
    inner class ViewAX {
        var img_hinh: ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }
}
