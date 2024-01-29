package tuan6_kotlin

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyKotlinFn {
    var strJSON=""
    fun getJSON_ArrayObjects(context: Context, textView: TextView) {
        //1. Tao request
        val queue=Volley.newRequestQueue(context)
        //2. url
        val url="https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json"
        //3. goi request (mang cua cac doi tuong)

        val request=JsonArrayRequest(url,
            Response.Listener {
                response ->
                for(i in 0 until response.length())//for mang
                {
                    val person = response.getJSONObject(i)
                    val id=person.getString("id")
                    val name=person.getString("name")
                    val email=person.getString("email")
                    strJSON += "id:  $id\n"
                    strJSON += "name:  $name\n"
                    strJSON += "email:  $email\n"
                }
                textView.text = strJSON
            },
            Response.ErrorListener {
                error -> textView.text= error.message
            })
        //4. thuc thi request
        queue.add(request)
    }
}