package com.example.appbd;

/**
 * Curso
 */
public class Curso {
    private int idCurso;
    private String nomeCurso;

    public Curso(int idCurso, String nomeCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
    }

    public Curso() {
        this.idCurso = -1;
        this.nomeCurso = "";
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public int getIdCurso() {
        return idCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }

}