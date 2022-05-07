package com.magdamiu.androidfundamentalsspring2022.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NotNull
    @ColumnInfo(name = "word")
    private String theWord;

    public Word(String theWord) {
        this.theWord = theWord;
    }

    @NotNull
    public String getTheWord() {
        return theWord;
    }

    @Override
    public String toString() {
        return "Word{" +
                "theWord='" + theWord + '\'' +
                '}';
    }
}
