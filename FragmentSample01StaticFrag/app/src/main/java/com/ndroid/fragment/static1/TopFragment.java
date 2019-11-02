package com.ndroid.fragment.static1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import java.util.Random;

public class TopFragment extends Fragment implements View.OnClickListener {
    Button btn1, btn2, btn3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        initViews(view);
        addListeners();
        return view;
    }


    private void initViews(View view) {
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
    }

    private void addListeners() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        BottomFragment bf = (BottomFragment) getFragmentManager().findFragmentById(R.id.fragBottom);

        if (v.getId() == btn1.getId()) {
            bf.change("Button 1 Clicked");
        } else if (v.getId() == btn2.getId()) {
            bf.change("Button 2 Clicked");
        } else if (v.getId() == btn3.getId()) {
            Random random = new Random();
            int value = random.nextInt(1000);
            bf.change("" + value);
        }
    }
}
