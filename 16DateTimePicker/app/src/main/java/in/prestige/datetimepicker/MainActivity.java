package in.prestige.datetimepicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    TextView textView;
    DatePicker datePicker;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        timePicker = findViewById(R.id.timePicker);
        textView = findViewById(R.id.textView);
        datePicker = findViewById(R.id.datePicker);

        Calendar calendar = Calendar.getInstance();

//        datePicker.init(calendar.get(Calendar.YEAR),
////                calendar.get(Calendar.MONTH),
////                calendar.get(Calendar.DAY_OF_MONTH),
////                new DatePicker.OnDateChangedListener() {
////                    @Override
////                    public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
////                        textView.setText("You Selected: "+day+"/"+(month+1)+"/"+year);
////                    }
////                });

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                textView.setText("You Selected: "+day+"/"+(month+1)+"/"+year);
            }
        });

//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
//                textView.setText("Hour: "+ hour +"\nMinutes: "+minute);
//            }
//        });
    }
}