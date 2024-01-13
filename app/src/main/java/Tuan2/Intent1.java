package Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.sum.R;

public class Intent1 extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);
        txt1 = findViewById(R.id.Intent1tv1);
        txt2 = findViewById(R.id.Intent1tv2);
        btn1 = findViewById(R.id.Intent1btn1);
        //Khi click button
        btn1.setOnClickListener(v->{
            //dinh huong di chuyen
            Intent i = new Intent(Intent1.this, Intent2.class);
            //dua du lieu vao
            i.putExtra("so1", txt1.getText().toString());
            i.putExtra("so2", txt2.getText().toString());
            //khoihanh
            startActivity(i);
        });
    }
}