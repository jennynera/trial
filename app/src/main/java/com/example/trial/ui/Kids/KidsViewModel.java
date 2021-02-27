package com.example.trial.ui.Kids;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KidsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KidsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kids fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
