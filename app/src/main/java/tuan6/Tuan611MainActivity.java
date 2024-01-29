package tuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sum.R;

public class Tuan611MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvkq;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan611_main);
        Tuan6VolleyFn volleyFn=new Tuan6VolleyFn();
        tvkq=findViewById(R.id.tuan613tvkq);
        btnGetData=findViewById(R.id.tuan613btn);
        btnGetData.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tvkq);
            }
        });
    }
}