package com.example.appbd;

import java.util.List;
public class Estudante {
    private int id;
    private String nome;
    private String matricula;
    private List<Curso> cursos;

    public Estudante(){
        this.id = -1;
        this.nome = "";
        this.matricula = "";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    public List<Curso> getCursos() {
        return cursos;
    }
}
