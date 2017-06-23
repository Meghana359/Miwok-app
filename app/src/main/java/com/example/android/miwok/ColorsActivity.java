package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
        private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
      final ArrayList<word> num =new ArrayList<word>();

        num.add(new word("wetetti","red",R.drawable.color_red,R.raw.color_red));
        num.add(new word("chiwiitɘ","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        num.add(new word("topiisɘ","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        num.add(new word("chokokki","green",R.drawable.color_green,R.raw.color_green));
        num.add(new word("takakki","brown",R.drawable.color_brown,R.raw.color_brown));
        num.add(new word("topoppi","gray",R.drawable.color_gray,R.raw.color_gray));
        num.add(new word("kululli","black",R.drawable.color_black,R.raw.color_black));
        num.add(new word("kelelli","white",R.drawable.color_white,R.raw.color_white));


        WordAdapter itemsAdapter=new WordAdapter(this,num, R.color.category_colors);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                word Word=num.get(position);
                        mMediaPlayer = MediaPlayer.create(ColorsActivity.this, Word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });



        }


    }

