package com.example.tst1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {   
    public DBOpenHelper(Context context) {   
        super(context, "yhn.db", null, 1);   
    }   
   
    //���ݿ��һ�δ���ʱ����ã�   
    public void onCreate(SQLiteDatabase db) {   
        db.execSQL("create table user(uid integer primary key autoincrement, uname varchar(20), uaddress varchar(20))");   
    }   
   
    //���ݿ��ļ��汾�ŷ����仯ʱ����   
    
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}  
    
}