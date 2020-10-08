package com.leaf.statusbarutil.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;




import com.leaf.statusbarutil.R;

import java.util.List;


public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_main);


        List<Lesson> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Lesson lesson = (Lesson) o;
                Toast.makeText(LessonActivity.this,"Selected:"+""+lesson, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Lesson> getListData() {
        List<Lesson> list = new ArrayList<Lesson>();
        Lesson lesson1 = new Lesson("Lesson1", "98000000", "l1");
        Lesson lesson2 = new Lesson("Lesson2", "320000000", "l2");
        Lesson lesson3 = new Lesson("Lesson3", "142000000", "l3");
        Lesson audio = new Lesson("Audio", "98000000", "l4");
        Lesson contact = new Lesson("Contact", "320000000", "l5");
        Lesson help = new Lesson("Help", "142000000", "l6");
        Lesson video = new Lesson("Video", "98000000", "l7");
        Lesson home = new Lesson("Home", "320000000", "l8");

        list.add(lesson1);
        list.add(lesson2);
        list.add(lesson3);
        list.add(audio);
        list.add(contact);
        list.add(help);
        list.add(video);
        list.add(home);

        return list;
    }

}
