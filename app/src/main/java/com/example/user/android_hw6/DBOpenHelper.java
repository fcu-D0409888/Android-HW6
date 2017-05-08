package com.example.user.android_hw6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 2017/5/8.
 */

public class DBOpenHelper extends SQLiteOpenHelper {
    public DBOpenHelper(Context context) {
        super(context, "note.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + NoteDB.NOTETABLE + "(title, body);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
    }
}
