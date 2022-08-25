package za.gov.saps.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rv;
    private Button button;
    private EditText editText, editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         
        rv = findViewById(R.id.recycle);
        editText = findViewById(R.id.edit);
        editText1 = findViewById(R.id.edit1);
        button = findViewById(R.id.button);

        List<String> name = new ArrayList<>();
        List<String> area = new ArrayList<>();

        rv.setLayoutManager(new LinearLayoutManager(MainActivity2.this));
        MyAdaptor adapter = new MyAdaptor(MainActivity2.this, name, area);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.add(editText.getText().toString());
                area.add(editText1.getText().toString());

                adapter.notifyDataSetChanged();
            }
        });

        rv.setAdapter(adapter);
    }
}