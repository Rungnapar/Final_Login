package com.example.final_login.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by locus on 12/18/2016.
 */
public class userlist {

    private static final String TAG =userlist.class.getSimpleName();

    private static userlist mInstance;
    private Context mContext;

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;

    private ArrayList<user> uAList = new ArrayList<>();
    private Random mRandom = new Random();

    public static userlist getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new userlist(context);
        }
        return mInstance;
    }


    private userlist(Context context) {
        this.mContext = context;
    }

    public void loadFromDatabase() {


        mHelper = new DatabaseHelper(mContext);
        mDb = mHelper.getWritableDatabase();
        Cursor cursor = mDb.query(DatabaseHelper.TABLE_NAME, null, null, null, null, null, null);

    }
}
