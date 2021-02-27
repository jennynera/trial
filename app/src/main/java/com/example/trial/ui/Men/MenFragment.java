package com.example.trial.ui.Men;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.trial.R;

public class MenFragment extends Fragment {

    private MenViewModel MenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MenViewModel =
                ViewModelProviders.of(this).get(MenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_men, container, false);
        final TextView textView = root.findViewById(R.id.text_men);
        MenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
