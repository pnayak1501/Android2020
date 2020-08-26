package in.prestige.reddice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imv1;
    private ImageView imv2;
    private Button btn;
    private Random ran = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button3);
        imv1 = findViewById(R.id.imageView2);
        imv2 = findViewById(R.id.imageView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollMyDice();
            }
        });
    }

    private void rollMyDice(){
        int myRanNumber1 = ran.nextInt(6) + 1;
        int myRanNumber2 = ran.nextInt(6) + 1;
        switch(myRanNumber1){
            case 1:
                imv1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imv1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imv1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imv1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imv1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imv1.setImageResource(R.drawable.dice6);
                break;
        }

        switch(myRanNumber2){
            case 1:
                imv2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imv2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imv2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imv2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imv2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imv2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}