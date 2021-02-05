package com.example.makecoding.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import com.example.makecoding.R;

public class Them extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settingTheme();
        setContentView(R.layout.activity_them);
    }

    public void settingTheme() {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String themeName = pref.getString("prefTheme", "Default");
        if (themeName.equals("Default")) {
            setTheme(R.style.Theme_Makecoding);
        } else if (themeName.equals("Red")) {
            setTheme(R.style.RedTheme);
        } else if (themeName.equals("Green")) {
            setTheme(R.style.GreenTheme);
        } else if (themeName.equals("Yellow")) {
            setTheme(R.style.YellowTheme);
        }
    }

    public void setPreference(View view) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        if (view.getId() == R.id.buttonOriginal){
            editor.putString("prefTheme","Default");
        } else if (view.getId() == R.id.buttonGreen){
            editor.putString("prefTheme","Green");
            editor.apply();
        }else if (view.getId() == R.id.buttonYellow){
            editor.putString("prefTheme","Yellow");
        }
        else if (view.getId() == R.id.buttonRed){
            editor.putString("prefTheme","Red");
        }
        editor.apply();
        settingTheme();
        Them.this.recreate();
    }
}