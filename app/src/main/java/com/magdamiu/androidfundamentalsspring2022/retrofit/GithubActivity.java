package com.magdamiu.androidfundamentalsspring2022.retrofit;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.magdamiu.androidfundamentalsspring2022.R;

import java.util.List;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository usersRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        usersRepository = UsersRepository.getInstance();

        usersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                StringBuilder stringBuilder = new StringBuilder();
                for (User user : users) {
                    stringBuilder.append(user.toString() + " /// ");
                }
                Log.e("Github users = ", users.toString());
                Toast.makeText(GithubActivity.this, stringBuilder.toString(), Toast.LENGTH_LONG).show();

                // if you are using a RecyclerView here is the place to populate the data source
            }

            @Override
            public void onError() {
                Log.e("error Github users = ", "check the code :D ");
                Toast.makeText(GithubActivity.this, "error getting the Github users",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}