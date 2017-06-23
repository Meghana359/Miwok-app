package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
       final ArrayList<word> num =new ArrayList<word>();

        num.add(new word("lutti","one",R.drawable.number_one,R.raw.number_one));
        num.add(new word("otiiko","two",R.drawable.number_two,R.raw.number_two));
        num.add(new word("tolookosu","three",R.drawable.number_three,R.raw.number_three));
        num.add(new word("oyyiisa","four",R.drawable.number_four,R.raw.number_four));
        num.add(new word("massokka","five",R.drawable.number_five,R.raw.number_five));
        num.add(new word("temmoka","six",R.drawable.number_six,R.raw.number_six));
        num.add(new word("kenekaku","seven",R.drawable.number_seven,R.raw.number_seven));
        num.add(new word("kawinta","eight",R.drawable.number_eight,R.raw.number_eight));
        num.add(new word("wo'e","nine",R.drawable.number_nine,R.raw.number_nine));
        num.add(new word("na'aacha","ten",R.drawable.number_ten,R.raw.number_ten));


        WordAdapter itemsAdapter=new WordAdapter(this,num,R.color.category_numbers);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                word Word=num.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, Word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });

    }
}
