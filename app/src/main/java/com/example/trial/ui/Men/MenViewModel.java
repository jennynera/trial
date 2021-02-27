package com.example.trial.ui.Men;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Men fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}