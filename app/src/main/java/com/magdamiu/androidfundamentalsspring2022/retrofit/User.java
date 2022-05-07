package com.magdamiu.androidfundamentalsspring2022.retrofit;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private String username;

    private long id;

    @SerializedName("avatar_url")
    private String avatarUrl;

    public User(String username, long id, String avatarUrl) {
        this.username = username;
        this.id = id;
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }
}
