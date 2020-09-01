package in.prestige.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void submit(View view) {
        float ratingValue = ratingBar.getRating();

        if(ratingValue < 2){
            textView.setText("Rating:" + ratingValue + "\nWe will try better next time");
            Toast toast = Toast.makeText(this,"We are sorry",Toast.LENGTH_SHORT);
            toast.setGravity(0,0,0);
            toast.show();
        }
        else if(ratingValue <=3 && ratingValue>=2){
            textView.setText("Rating:" + ratingValue + "\nWe are constantly improving");
            Toast toast = Toast.makeText(this,"We are trying our best",Toast.LENGTH_SHORT);
            toast.setGravity(0,0,0);
            toast.show();
        }
        else if(ratingValue <=4 && ratingValue>3){
            textView.setText("Rating:" + ratingValue + "\nWe are happy to know this");
            Toast toast = Toast.makeText(this,"We are happy to know this",Toast.LENGTH_SHORT);
            toast.setGravity(0,0,0);
            toast.show();
        }
        else if(ratingValue <=5 && ratingValue>4){
            textView.setText("Rating:" + ratingValue + "\nWe are really happy that you like us!");
            Toast toast = Toast.makeText(this,"We are extremely happy",Toast.LENGTH_SHORT);
            toast.setGravity(0,0,0);
            toast.show();
        }
    }
}