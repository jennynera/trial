package com.example.trial.ui.wishlist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WishlistViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public WishlistViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is wishlist fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
