package com.example.final_login;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.final_login.DB.user;

/**
 * Created by locus on 12/18/2016.
 */
public class UserListActiviyt extends ArrayAdapter<user>  {

    public UserListActiviyt(Context context, int resource) {
        super(context, resource);
    }
}
