package com.example.myrecipeapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApp extends Application {

        @Override
        public void onCreate() {
            super.onCreate();


            Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("aVuL2JznxNNQKqTai99KNYRV8W5AEUzL2gcNAkLh")
                    .clientKey("lhPM9Xg9WmeJOw31TVnNPGNKN0rC26mieifaQLb8")
                    .server("https://parseapi.back4app.com")
                    .build()
            );
        }
}
