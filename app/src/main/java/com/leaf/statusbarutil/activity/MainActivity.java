package com.leaf.statusbarutil.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.leaf.library.StatusBarUtil;
import com.leaf.statusbarutil.R;
import com.leaf.statusbarutil.utils.AppUtils;


/**
 * @author：created by Son
 */
public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = findViewById(R.id.toolbar);

        StatusBarUtil.setColor(this, AppUtils.getColor(R.color.start_blue));

        Button btn = findViewById(R.id.btn);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btnls = findViewById(R.id.btnls);
        TextView mVersionText = findViewById(R.id.version_text);


        btn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ColorActivity.class)));


        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TransparentActivity.class)));


        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, GradientActivity.class)));


        btn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, InFragmentActivity.class)));


        btn4.setOnClickListener(v -> {
            StatusBarUtil.setColor(MainActivity.this, AppUtils.getColor(R.color.start_blue));
            mToolbar.setBackgroundColor(AppUtils.getColor(R.color.start_blue));
            StatusBarUtil.setLightMode(MainActivity.this);
        });


        btn5.setOnClickListener(v -> {
            StatusBarUtil.setColor(MainActivity.this, AppUtils.getColor(R.color.start_blue));
            mToolbar.setBackgroundColor(AppUtils.getColor(R.color.start_blue));
            StatusBarUtil.setDarkMode(MainActivity.this);
        });

        btnls.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LessonActivity.class)));


        mVersionText.setText(
                "NSX" + AppUtils.getDeviceBrand() + "\n" +
                        "DT" + AppUtils.getSystemModel() + "\n" +
                        "Phien ban Android" + AppUtils.getSystemVersion()
        );
    }

}
