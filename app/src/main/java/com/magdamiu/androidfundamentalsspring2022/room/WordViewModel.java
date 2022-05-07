package com.magdamiu.androidfundamentalsspring2022.room;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository wordRepository;
    private LiveData<List<Word>> words;

    public WordViewModel(@NonNull Application application) {
        super(application);
        wordRepository = new WordRepository(application);
        words = wordRepository.getWords();
    }

    public LiveData<List<Word>> getWords() {
        return words;
    }

    void insert(Word word) {
        wordRepository.insert(word);
    }
}
