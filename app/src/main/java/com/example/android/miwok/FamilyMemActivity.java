package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class FamilyMemActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
      final  ArrayList<word> num =new ArrayList<word>();

        num.add(new word("ɘpɘ","father",R.drawable.family_father,R.raw.family_father));
        num.add(new word("ɘta","mother",R.drawable.family_mother,R.raw.family_mother));
        num.add(new word("angsi","son",R.drawable.family_son,R.raw.family_son));
        num.add(new word("tune","daughter",R.drawable.family_daughter,R.raw.family_daughter));
        num.add(new word("taachi","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        num.add(new word("chalitti","younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        num.add(new word("tete","older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        num.add(new word("kolliti","younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        num.add(new word("ama","grand mother",R.drawable.family_grandmother,R.raw.family_grandmother));
        num.add(new word("paapa","grand father",R.drawable.family_grandfather,R.raw.family_grandfather));


        WordAdapter itemsAdapter=new WordAdapter(this,num, R.color.category_family);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                word Word=num.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyMemActivity.this, Word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });


    }
    private void releaseMethod(){
        if(mMediaPlayer!=null)
            mMediaPlayer.release();
        else
            mMediaPlayer=null;
    }
}
