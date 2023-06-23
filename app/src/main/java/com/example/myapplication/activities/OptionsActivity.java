package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityOptionsBinding;
import com.example.myapplication.utilities.PreferenceManager;

public class OptionsActivity extends AppCompatActivity {
    private ActivityOptionsBinding binding;

    private PreferenceManager preferenceManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferenceManager= new PreferenceManager(getApplicationContext());
       binding = ActivityOptionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }



    public void setListeners() {

        binding.Java.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest2.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest3.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest4.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest5.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest6.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest7.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest8.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest9.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        binding.interest10.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MainActivity.class)));

    }
}
