package com.example.trial.ui.Women;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class womenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public womenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is women fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}