package com.example.alexander.pkexares.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SQLProducto extends SQLConexion {

    private Context ct;

    public SQLProducto(Context context){
        super(context);
        ct=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){super.onCreate(db);}

    @Override
    public void onUpgrade(SQLiteDatabase db,int i, int il){super.onUpgrade(db, i, il);}
}
