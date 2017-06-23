package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private int mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
       final ArrayList<phrases> num1 =new ArrayList<phrases>();

        num1.add(new phrases("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        num1.add(new phrases("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        num1.add(new phrases("oyaaset...","My name is...",R.raw.phrase_my_name_is));
        num1.add(new phrases("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        num1.add(new phrases("kuchi achit","I’m feeling good.",R.raw.phrase_im_feeling_good));
        num1.add(new phrases("әәnәs'aa?","Are you coming?",R.raw.phrase_are_you_coming));
        num1.add(new phrases("hәә’ әәnәm","Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        num1.add(new phrases("әәnәm","I’m coming.",R.raw.phrase_im_coming));
        num1.add(new phrases("yoowutis","Let’s go.",R.raw.phrase_lets_go));
        num1.add(new phrases("әnni'nem","Come here.",R.raw.phrase_come_here));


        PhrasesAdapter itemsAdapter=new PhrasesAdapter(this,num1,R.color.category_phrases);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                phrases Word=num1.get(position);
                MediaPlayer mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, Word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });

    }
}
