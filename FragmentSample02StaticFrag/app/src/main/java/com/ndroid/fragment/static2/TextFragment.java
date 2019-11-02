package com.ndroid.fragment.static2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TextFragment extends Fragment {
    TextView tvAndroidOs, tvVersion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_text, container, false);
        tvAndroidOs = view.findViewById(R.id.tvAndroidOs);
        tvVersion = view.findViewById(R.id.tvVersion);


        return view;

    }

    public void change(String txt, String version) {
        tvAndroidOs.setText(txt);
        tvVersion.setText(version);
    }
}