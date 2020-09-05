package in.prestige.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,pound,dollar,yen,dinar,bitcoin,ruble,aus,can;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bit);
        ruble = findViewById(R.id.ruble);
        aus = findViewById(R.id.aus);
        can = findViewById(R.id.can);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.011;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.013;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.010;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*1.42;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.0041;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.0000012;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.98;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.019;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.018;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
//                  textView.setText(""+k);
                }
            }
        });



    }
}