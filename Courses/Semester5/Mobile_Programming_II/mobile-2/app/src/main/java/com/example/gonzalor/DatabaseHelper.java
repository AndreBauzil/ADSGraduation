package com.example.gonzalor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "divisas_db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_DIVISAS = "tabla_divisas"; // Nombre de la tabla corregido

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear la tabla para almacenar las divisas si no existe
        String createTableQuery = "CREATE TABLE IF NOT EXISTS " + TABLE_DIVISAS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT, " +
                "high REAL, " +
                "low REAL" +
                // Agregar otros campos necesarios
                ")";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Eliminar la tabla existente si es necesario y crear una nueva
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DIVISAS);
        onCreate(db);
    }
}

