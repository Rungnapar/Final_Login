package com.example.final_login.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by locus on 12/18/2016.
 */
public class DatabaseHelper  extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "login";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "user";
    public static final String COL_ID = "_id";
    public static final String COL_name = "name";
    public static final String COL_username = "username";
    public static final String COL_password = "password";


    private static final String SQL_CRATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_name + " TEXT, "
                    + COL_username + " TEXT, "
                    + COL_password + " TEXT, "
                    + ")";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE);
        insertInitialData(db);
    }


    private void insertInitialData(SQLiteDatabase db) {
        ContentValues input = new ContentValues();
        input.put(COL_name, "Android Studio");
        input.put(COL_username, "Android");
        input.put(COL_password, "123456");
        db.insert(TABLE_NAME, null, input);

        input = new ContentValues();
        input.put(COL_name, "Promlert Lovichit");
        input.put(COL_username, "Promlert");
        input.put(COL_password, "456789");
        db.insert(TABLE_NAME, null, input);

        input = new ContentValues();
        input.put(COL_name, "Mark Zuckerberg");
        input.put(COL_username, "Mark");
        input.put(COL_password, "789012");
        db.insert(TABLE_NAME, null, input);

    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
