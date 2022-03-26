package com.mirea.chubuka_v_a.dialog;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked(){
        Toast.makeText(this, "Вы нажали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked(){
        Toast.makeText(this, "Вы нажали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked(){
        Toast.makeText(this, "Вы нажали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }


    public void onClickShowTimePickerDialog(View view) {
        DateDialog dateDialog = new DateDialog();
        dateDialog.show(getSupportFragmentManager(), "timePicker");
    }

    public void onClickShowDatePickerDialog(View view) {
        TimeDialog timeDialog = new TimeDialog();
        timeDialog.show(getSupportFragmentManager(), "datePicker");
    }

    public void onClickShowProgressDialog(View view) {
        MyProgressDialog myProgressDialog = new MyProgressDialog();
        myProgressDialog.show(getSupportFragmentManager(), "progress");
    }
}