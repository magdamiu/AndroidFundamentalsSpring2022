package com.magdamiu.androidfundamentalsspring2022.retrofit;

import java.util.List;

public interface OnGetUsersCallback {
    void onSuccess(List<User> users);

    void onError();
}
