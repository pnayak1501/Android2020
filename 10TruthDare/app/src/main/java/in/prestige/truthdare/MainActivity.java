package in.prestige.truthdare;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button button;
    private ImageView imageView;
    private Random random = new Random();
    public int lastDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
    }

    public void spin(View view) {

        int newDirection = random.nextInt(3600)+720;

        float pivotX = imageView.getWidth()/2;
        float pivotY = imageView.getHeight()/2;

        Animation rotate = new RotateAnimation(lastDirection,newDirection,pivotX,pivotY);
        rotate.setDuration(2000);
        rotate.setFillAfter(true);

        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
                button.setBackground(getDrawable(R.drawable.disabled_button));
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);
                button.setBackground(getDrawable(R.drawable.custom_button));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        lastDirection = newDirection;
        imageView.startAnimation(rotate);


    }
}