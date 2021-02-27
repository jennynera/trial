package com.example.trial.ui.account;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountViewModel extends ViewModel {
   private MutableLiveData<String> mText;

    public AccountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is account fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
   // EditText name = findViewById(R.id.name);
    //EditText mobno = findViewById(R.id.mobno);
    //EditText address = findViewById(R.id.add);
    ///EditText emailid = findViewById(R.id.email);


    //showAllUserData();




//}

   // private void showAllUserData() {
     //   Intent intent = getIntent();
       // String user_name = intent.getStringExtra("fullName");
        //String user_mobno = intent.getStringExtra("mob");
        //String user_address = intent.getStringExtra("add");
        //String user_email = intent.getStringExtra("email");

       // name.setText(user_name);
        //mobno.setText(user_mobno);
        //address.setText(user_address);
        //emailid.setText(user_email);
   // }
    }
