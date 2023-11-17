package com.example.appbd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database extends SQLiteOpenHelper {
    private static final String TAG = "BANCO";
    private static final String NOME_BANCO = "banco.sqlite";
    private static final int VERSAO = 1;

    public Database(Context context){
        super(context,NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d(TAG, "Criando tabelas do banco.");
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS estudante(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, matricula TEXT);");

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS curso(" +
                "idCurso INTEGER PRIMARY KEY AUTOINCREMENT, nomeCurso TEXT);");

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS estudante_curso(" +
                "idEstudante INTEGER, idCurso INTEGER," +
                "FOREIGN KEY (idEstudante) REFERENCES estudante(id)," +
                "FOREIGN KEY (idCurso) REFERENCES curso(idCurso)," +
                "PRIMARY KEY (idEstudante, idCurso));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //nao utilizaremos este
    }
}
