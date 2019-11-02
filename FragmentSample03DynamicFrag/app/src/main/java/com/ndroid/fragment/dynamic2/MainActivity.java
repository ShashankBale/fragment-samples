package com.ndroid.fragment.dynamic2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnMacOs;
    private Button btnWindows;
    private Button btnLinux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        populateValue();
        addListeners();

    }

    private void initViews() {
        btnMacOs = findViewById(R.id.btnMacOs);
        btnWindows = findViewById(R.id.btnWindows);
        btnLinux = findViewById(R.id.btnLinux);

    }

    private void populateValue() {
        setTitle("Fragment Dynamically Example");

        // Create and set macOS Fragment as default.
        Fragment macOsFragment = new MacOsFragment();
        setDefaultFragment(macOsFragment);
    }

    private void addListeners() {
        // Click this button to display macOS fragment.
        btnMacOs.setOnClickListener(this);

        // Click this button to display windows fragment.
        btnWindows.setOnClickListener(this);

        // Click this button to display iOS fragment.
        btnLinux.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int clickedId = v.getId();
        if(clickedId==btnMacOs.getId())
        {
            Fragment macOsFragment = new MacOsFragment();
            replaceFragment(macOsFragment);
        }
        else if(clickedId==btnWindows.getId())
        {
            Fragment windowsFragment = new WindowsFragment();
            replaceFragment(windowsFragment);
        }
        else if(clickedId==btnLinux.getId())
        {
            Fragment linuxFragment = new LinuxFragment();
            replaceFragment(linuxFragment);
        }

    }

    // This method is used to set the default fragment that will be shown.
    private void setDefaultFragment(Fragment defaultFragment)
    {
        this.replaceFragment(defaultFragment);
    }


    // Replace current Fragment with the destination Fragment.
    public void replaceFragment(Fragment destFragment)
    {
        // First get FragmentManager object.
        FragmentManager fragmentManager = this.getSupportFragmentManager();

        // Begin Fragment transaction.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the layout holder with the required Fragment object.
        fragmentTransaction.replace(R.id.flDynamicFragment, destFragment);

        // Commit the Fragment replace action.
        fragmentTransaction.commit();
    }
}
