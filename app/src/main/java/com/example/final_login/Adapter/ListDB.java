package com.example.final_login.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.final_login.DB.user;
import com.example.final_login.R;

import java.util.ArrayList;

/**
 * Created by locus on 12/18/2016.
 */
public class ListDB extends ArrayAdapter<user> {

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<user> mQAList;

    public ListDB(Context context, int resource, ArrayList<user> users) {
        super(context, resource, users);

        this.mContext = context;
        this.mLayoutResId = resource;
        this.mQAList = users;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemLayout = View.inflate(mContext, mLayoutResId, null);

       /* TextView us=(TextView) itemLayout.findViewById(R.id.tv_Q) ;

        user u = mQAList.get(position);
        us.setText(u.getNamename());*/

        return super.getView(position, convertView, parent);
    }




}
