package in.prestige.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    int c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12=0;
    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.imageButton1);
        b2 = findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);
        b5 = findViewById(R.id.imageButton5);
        b6 = findViewById(R.id.imageButton6);
        b7 = findViewById(R.id.imageButton7);
        b8 = findViewById(R.id.imageButton8);
        b9 = findViewById(R.id.imageButton9);
        b10 = findViewById(R.id.imageButton10);
        b11 = findViewById(R.id.imageButton11);
        b12 = findViewById(R.id.imageButton12);

        m1 = MediaPlayer.create(this,R.raw.filhal);
        m2 = MediaPlayer.create(this,R.raw.mereliye);
        m3 = MediaPlayer.create(this,R.raw.breathless);
        m4 = MediaPlayer.create(this,R.raw.tumsehi);
        m5 = MediaPlayer.create(this,R.raw.malang);
        m6 = MediaPlayer.create(this,R.raw.kauntujhe);
        m7 = MediaPlayer.create(this,R.raw.maintumhara);
        m8 = MediaPlayer.create(this,R.raw.humraah);
        m9 = MediaPlayer.create(this,R.raw.tere);
        m10 = MediaPlayer.create(this,R.raw.terihi);
        m11 = MediaPlayer.create(this,R.raw.tujhe);
        m12 = MediaPlayer.create(this,R.raw.khairiyat);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1%2==0) {
                    m1.start();
                    c1++;
                }
                else{
                    m1.pause();
                    c1++;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c2%2==0) {
                    m2.start();
                    c2++;
                }
                else{
                    m2.pause();
                    c2++;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c3%2==0) {
                    m3.start();
                    c3++;
                }
                else{
                    m3.pause();
                    c3++;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c4%2==0) {
                    m4.start();
                    c4++;
                }
                else{
                    m4.pause();
                    c4++;
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c5%2==0) {
                    m5.start();
                    c5++;
                }
                else{
                    m5.pause();
                    c5++;
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c6%2==0) {
                    m6.start();
                    c6++;
                }
                else{
                    m6.pause();
                    c6++;
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c7%2==0) {
                    m7.start();
                    c7++;
                }
                else{
                    m7.pause();
                    c7++;
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c8%2==0) {
                    m8.start();
                    c8++;
                }
                else{
                    m8.pause();
                    c8++;
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c9%2==0) {
                    m9.start();
                    c9++;
            }
                else{
                m9.pause();
                c9++;
            }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c10%2==0) {
                    m10.start();
                    c10++;
                }
                else{
                    m10.pause();
                    c10++;
                }            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c11%2==0) {
                    m11.start();
                    c11++;
                }
                else{
                    m11.pause();
                    c11++;
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c12%2==0) {
                    m12.start();
                    c12++;
                }
                else{
                    m12.pause();
                    c12++;
                }
            }
        });
    }
}