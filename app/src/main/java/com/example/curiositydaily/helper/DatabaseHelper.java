package com.example.curiositydaily.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View;

import com.example.curiositydaily.model.UserInfo;
import com.example.curiositydaily.model.UserLogin;

public class DatabaseHelper extends SQLiteOpenHelper {

    // 建立用户登录表语句
    public static final String CREATE_USERLOGIN = "create table user_login(id integer primary key autoincrement,number text,password text)";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version) {
        super(context, name, null, version);
    }

    // 创建数据表
    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建用户登录表user_login
        db.execSQL(CREATE_USERLOGIN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
