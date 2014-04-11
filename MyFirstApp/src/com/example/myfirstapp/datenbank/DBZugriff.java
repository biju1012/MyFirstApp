package com.example.myfirstapp.datenbank;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBZugriff extends SQLiteOpenHelper {

	   private SQLiteDatabase db;

	   // Konstruktor
	   public DBZugriff(Context activity, String dbName) {
	      super(activity, dbName, null, 1); 
	      db = getWritableDatabase();
	   }

	   public void onCreate(SQLiteDatabase db) {
	     try {
	        // Tabelle anlegen 
	        String sql = "CREATE TABLE freunde "  +
	                      "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
	                      "name VARCHAR(20) NOT NULL, " +
	                      "vorname VARCHAR(20) NOT NULL, " +       
	                      "geburtsdatum DATE)";
	        db.execSQL(sql); 
	     }
	     catch(Exception ex) {
	       Log.e("carpelibrum", ex.getMessage());
	     }
	   }

	   public void onUpgrade(SQLiteDatabase db, int oldVersion, 
	                        int newVersion) {
	      // auf Versionswechsel reagieren
	   }
	}