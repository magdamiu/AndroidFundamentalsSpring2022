package com.magdamiu.androidfundamentalsspring2022;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AlertsActivity extends AppCompatActivity {

    private TextView textViewDate, textViewTime;
    int year, month, day, hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        textViewDate = findViewById(R.id.textViewDate);
        textViewTime = findViewById(R.id.textViewTime);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
    }

    public void openDatePickerOnClick(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(AlertsActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int selectedYear, int selectedMonth, int selectedDay) {
                textViewDate.setText(String.format("%d-%d-%d", selectedDay, selectedMonth + 1, selectedYear));
            }
        }, year, month, day);
        datePickerDialog.show();
    }

    public void openTimePickerOnClick(View view) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(AlertsActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                textViewTime.setText(String.format("%d:%d", selectedHour, selectedMinute));
            }
        }, hour, minute, true);
        timePickerDialog.show();
    }
}