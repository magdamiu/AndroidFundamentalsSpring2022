package com.magdamiu.androidfundamentalsspring2022.retrofit;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.magdamiu.androidfundamentalsspring2022.R;

import java.util.List;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository usersRepository;
    private IssuesRepository issuesRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        // getUsers();

        // github username
        String owner = "magdamiu";

        // repo name from github
        String repo = "AndroidFundamentalsSpring2022";

        // !!!! WARNING: it's token + space + value of the token
        // replace your_code with your token from github;
        String token = "token include_here_token";

        // issue details to be sent
        Issue issue = new Issue();
        issue.setTitle("This is an issue created from the android app");
        issue.setBody("It is just a test to use POST HTTP Verb with Retrofit");

        // send the issue to the repo on github
        postIssue(owner, repo, token, issue);
    }

    private void postIssue(String owner, String repo, String token, Issue issue) {
        issuesRepository = IssuesRepository.getInstance();
        issuesRepository.postIssue(new OnPostIssueCallback() {
            @Override
            public void onSuccess(Issue issue) {
                Log.e("Success", issue.toString());
                Toast.makeText(GithubActivity.this, issue.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError() {
                Log.e("Error", "Please check the logs");
                Toast.makeText(GithubActivity.this, "Error! Check the logs", Toast.LENGTH_SHORT).show();
            }
        }, owner, repo, token, issue);
    }

    private void getUsers() {
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