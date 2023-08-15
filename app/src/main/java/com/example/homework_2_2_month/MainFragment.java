package com.example.homework_2_2_month;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class MainFragment extends Fragment {
    private TextView textView;
    private int currentValue = 0;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.textView);
        Button addButton = requireActivity().findViewById(R.id.addButton);
        Button subtractButton = requireActivity().findViewById(R.id.subtractButton);

        addButton.setOnClickListener(v -> {
            currentValue++;
            updateTextView();
        });

        subtractButton.setOnClickListener(v -> {
            currentValue--;
            updateTextView();
        });
    }

    private void updateTextView() {
        textView.setText(String.valueOf(currentValue));
    }
}