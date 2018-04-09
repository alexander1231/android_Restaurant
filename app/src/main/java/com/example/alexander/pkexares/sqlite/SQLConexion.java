package com.example.alexander.pkexares.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLConexion extends SQLiteOpenHelper {

    private final static int DATA_VERSION=1;
    private final static String DATABASE_NAME="BDRESTAURANT.db";

    public SQLConexion(Context context) {
        super(context, DATABASE_NAME, null, DATA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
