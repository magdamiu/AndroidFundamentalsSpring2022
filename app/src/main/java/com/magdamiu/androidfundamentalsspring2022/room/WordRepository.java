package com.magdamiu.androidfundamentalsspring2022.room;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao wordDao;
    private LiveData<List<Word>> words;

    WordRepository(Application application) {
        WordRoomDatabase wordRoomDatabase = WordRoomDatabase.getDatabase(application);
        wordDao = wordRoomDatabase.wordDao();
        words = wordDao.getWords();
    }

    public LiveData<List<Word>> getWords() {
        return words;
    }

    // we must call this method on a different thread
    // it is a long running operations that should be done on a thread different than the UI (main) thread
    void insert(Word word) {
        WordRoomDatabase.databaseWriteExecutor.execute(() -> {
            wordDao.insert(word);
        });
    }
}
