package com.magdamiu.androidfundamentalsspring2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> androidVersions;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // WebView sample
        //setContentView(R.layout.activity_main);

        // ScrollView sample
        //setContentView(R.layout.views_first_part);

        setContentView(R.layout.spinner_sample);

        String messageToDisplay = "this is a message";
        Log.e("MainActivity", messageToDisplay);
        Log.w("MainActivity", "warning message");

        // displayUrlInWebView();

        spinner = findViewById(R.id.spinnerAndroidVersions);
        setDataSource();
        mapAdapterToTheSpinner();

        // use Picasso to display an image from an URL
        displayImageFromUrl();
    }

    // step 1: data source
    private void setDataSource() {
        androidVersions = new ArrayList<>();
        androidVersions.add("KitKat");
        androidVersions.add("Pie");
        androidVersions.add("Eclair");
        androidVersions.add("Gingerbread");
    }

    // step 2: get the adapter
    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, androidVersions);
    }

    // step 3: map the adapter to the spinner
    private void mapAdapterToTheSpinner() {
        spinner.setAdapter(getSpinnerAdapter());
    }

    private void displayUrlInWebView() {
        WebView webViewOneSample = findViewById(R.id.webViewSample);
        webViewOneSample.getSettings().setJavaScriptEnabled(true);
        webViewOneSample.loadUrl("https://developer.android.com/");
    }

    private void displayImageFromUrl() {
        ImageView imageView = findViewById(R.id.imageViewPicasso);

        // scenario 1:
        // happy path - we have internet connection & the url contains an image
        // Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);

        // scenario 2:
        // unhappy path - error to display the picture
        // Picasso.get().load("https://i.imgur.com/DvpvklsR.png").error(R.drawable.sun).into(imageView);

        // scenario 3:
        // use a placeholder that should be displayed until the image is loaded
        String url = "https://images.unsplash.com/photo-1649835120258-74d5b7355e34?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80";
        Picasso.get().load(url).placeholder(R.drawable.sun).into(imageView);
    }
}