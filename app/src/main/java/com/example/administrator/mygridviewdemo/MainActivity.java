package com.example.administrator.mygridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.etsy.android.grid.StaggeredGridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StaggeredGridView myGridView;
    private List<GridViewEntry> list = new ArrayList<>();
    private GridViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_02 , new String("显示1")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_03 , new String("显示2")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_04 , new String("显示3")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_05 , new String("显示4")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_06 , new String("显示5")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_07 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_08 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_09 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_10 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_11 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_12 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_13 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_14 , new String("显示6")));
        list.add(new GridViewEntry(R.drawable.meigui_lvxing_second_image_15 , new String("显示6")));

        myGridView = (StaggeredGridView) findViewById(R.id.grid_view);
        adapter = new GridViewAdapter(list , this);
        myGridView.setAdapter(adapter);
        myGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this , "点击了" + position , Toast.LENGTH_SHORT).show();
            }
        });


    }
}
