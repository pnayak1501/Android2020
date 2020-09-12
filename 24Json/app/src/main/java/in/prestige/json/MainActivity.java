package in.prestige.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        student student = new student("Hitesh",5,"hitesh@lco.in");
//        String json = gson.toJson(student);

//        String json = "{\"course_count\":5,\"email\":\"hitesh@lco.in\",\"name\":\"Hitesh\"}";
//        student student = gson.fromJson(json,student.class);
//        Log.d("TEST",student.toString());

//        List<Video> videos = new ArrayList<>();
//        videos.add(new Video("Intro",4));
//        videos.add(new Video("Exercise files",8));
//        videos.add(new Video("Installation",12));
//
//        Course course = new Course("Java","Bootcamp");
//        student student = new student("Prahlad",3,"pallu@gmail.com",course,videos);
//        String json = gson.toJson(student);

        String json = "{\"course_count\":3,\"email\":\"pallu@gmail.com\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"video\":[{\"duration\":4,\"name\":\"Intro\"},{\"duration\":8,\"name\":\"Exercise files\"},{\"duration\":12,\"name\":\"Installation\"}],\"name\":\"Prahlad\"}";
        student Student = gson.fromJson(json,student.class);
        Log.d("TEST",Student.toString());

    }
}