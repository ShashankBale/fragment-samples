package com.ndroid.fragment.static1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Bottom1Fragment extends Fragment {
    TextView tvText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        tvText = view.findViewById(R.id.tvText);
    }

    public void change(String msg)
    {
        tvText.setText(msg);
    }
}
