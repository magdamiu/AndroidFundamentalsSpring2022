package com.magdamiu.androidfundamentalsspring2022.room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.magdamiu.androidfundamentalsspring2022.R;

import java.util.List;

public class WordsActivity extends AppCompatActivity {

    private WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        wordViewModel = new ViewModelProvider(this).get(WordViewModel.class);
        wordViewModel.getWords().observe(this, new Observer<List<Word>>() {
            @Override
            public void onChanged(List<Word> words) {
                // update the adapter => adapter.setWords(words);
                Log.e("words", words.toString());
            }
        });

    }

    public void insertWordOnClick(View view) {

        // the "android" word could be taken from UI
        // here we reduced the implementation to focus on the room code
        Word word = new Word("android" + System.currentTimeMillis());
        wordViewModel.insert(word);
    }
}