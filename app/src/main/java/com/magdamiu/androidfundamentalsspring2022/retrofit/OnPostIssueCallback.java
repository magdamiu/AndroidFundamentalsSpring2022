package com.magdamiu.androidfundamentalsspring2022.retrofit;

public interface OnPostIssueCallback {
    void onSuccess(Issue issue);
    void onError();
}