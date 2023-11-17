package com.example.appbd;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class EstudanteDAO {
    private Database db;
    public EstudanteDAO(Database db){
        this.db = db;
    }
    public long salvar(Estudante e){
        long id = -1;
        SQLiteDatabase db2 = db.getWritableDatabase();
        try{
            ContentValues values = new ContentValues();
            values.put("nome", e.getNome());
            values.put("matricula", e.getMatricula());
            id = db2.insert("estudante", null, values);

            // Inserir cursos relacionados ao estudante
            for (Curso curso : e.getCursos()) {
                ContentValues cursoValues = new ContentValues();
                cursoValues.put("idEstudante", id); // id do estudante recém-inserido
                cursoValues.put("idCurso", curso.getIdCurso());
                cursoValues.put("nomeCurso", curso.getNomeCurso());

                db2.insert("estudante_curso", null, cursoValues);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return id;
    }

    public List<Estudante> buscarTodos(){
        List<Estudante> todos = new ArrayList<>();
        SQLiteDatabase db2 = db.getReadableDatabase();
        try{
            Cursor c = db2.rawQuery("SELECT * FROM estudante", null);
            if(c.moveToFirst()){
                do{
                    Estudante e = new Estudante();
                    e.setId(c.getInt(c.getColumnIndex("id")));
                    e.setNome(c.getString(c.getColumnIndex("nome")));
                    e.setMatricula(c.getString(c.getColumnIndex("matricula")));

                    // Buscar cursos relacionados ao estudante
                    List<Curso> cursos = buscarCursosPorEstudante(e.getId());
                    e.setCursos(cursos);

                    todos.add(e);
                } while(c.moveToNext());
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return todos;
    }

    public List<Curso> buscarCursosPorEstudante(int idEstudante) {
        List<Curso> cursos = new ArrayList<>();
        SQLiteDatabase db2 = db.getReadableDatabase();
    
        try {
            // Consulta SQL para obter os cursos associados ao estudante pelo idEstudante
            String query = "SELECT curso.idCurso, curso.nomeCurso " +
                           "FROM curso " +
                           "JOIN estudante_curso ON curso.idCurso = estudante_curso.idCurso " +
                           "WHERE estudante_curso.idEstudante = ?";
    
            Cursor c = db2.rawQuery(query, new String[]{String.valueOf(idEstudante)});
    
            if (c.moveToFirst()) {
                do {
                    Curso curso = new Curso();
                    curso.setIdCurso(c.getInt(c.getColumnIndex("idCurso")));
                    curso.setNomeCurso(c.getString(c.getColumnIndex("nomeCurso")));
                    cursos.add(curso);
                } while (c.moveToNext());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
        return cursos;
    }
}
