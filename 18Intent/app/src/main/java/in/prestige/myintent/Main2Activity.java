package in.prestige.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        String myValue = getIntent().getStringExtra("name");
        String myValue2 = getIntent().getStringExtra("password");
        textView.setText(myValue+" "+myValue2);
    }

    public void screentwo(View view) {
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
}