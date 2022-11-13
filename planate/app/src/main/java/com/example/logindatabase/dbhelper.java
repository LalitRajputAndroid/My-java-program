package com.example.logindatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class dbhelper extends SQLiteOpenHelper {
    private static final String database_name = "mydatabase";
    private static final int version = 1;
    private  static final String table_name = "userinfo";
    private static final String full_name = "name";
    private  static  final String email_address = "email";
    private static final String Password = "password";


    public dbhelper(Context context) {
        super(context, database_name,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE table_name (full_name TEXT, email_address TEXT, Password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ table_name);

        onCreate(sqLiteDatabase);
    }
    public  void insrtdata(String name, String email, String password){

        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(full_name,name);
        values.put(email_address,email);
        values.put(Password,password);

        database.insert(table_name,null,values);
    }
}
