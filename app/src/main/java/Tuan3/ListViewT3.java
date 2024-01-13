package Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sum.R;

import java.util.ArrayList;

public class ListViewT3 extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_t3);
        lv=findViewById(R.id.tuan32lv);
        //tao nguon du lieu
        ls.add(new T32Contact("Nguyen Van A", "18",R.drawable.android));
        ls.add(new T32Contact("Nguyen Van B", "19",R.drawable.apple));
        ls.add(new T32Contact("Nguyen Van C", "20",R.drawable.blogger));
        ls.add(new T32Contact("Nguyen Van D", "21",R.drawable.border));
        ls.add(new T32Contact("Nguyen Van E", "22",R.drawable.chrome));
        ls.add(new T32Contact("Nguyen Van F", "23",R.drawable.dell));
        //tao adapter
        adapter=new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }

}