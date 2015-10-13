package com.example.yongliu.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * use parse.com as database
 * Created by YongLiu on 10/12/15.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "7s1r3c4LLwSgNfKjuFxT1r4pn4VzLa98aehYBvKs", "r4fV3TyX8vmkE5hSVdmbS2YHJ1PjsnLKzkxN3loD");

    }
}
