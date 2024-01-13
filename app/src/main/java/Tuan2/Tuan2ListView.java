package Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sum.R;

public class Tuan2ListView extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_list_view);
        lv=findViewById(R.id.listv);
        //nguon du lieu
        String[] arr=new String[]{"Mon 1", "Mon 2", "Mon 3", "Mon 4", "Mon 5", "Mon 6", "aaa", "bbb"};
        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        //hien thi lên listview
        lv.setAdapter(adapter);
    }
}