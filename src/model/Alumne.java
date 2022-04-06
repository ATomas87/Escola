package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Alumne {
    private Integer id;
    private static Integer idSeguent = 1;
    private String nom;
    private List<Integer> llistaNotes;

    public Alumne(String nom) {
        this.nom = nom;
        this.id = idSeguent;
        idSeguent++;
        this.llistaNotes = new ArrayList<Integer>();
    }

    public void insertarNota(Integer nota) {
        this.llistaNotes.add(nota);
    }

    public abstract Integer calcularNotaFinal();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Integer> getLlistaNotes() {
        return llistaNotes;
    }

    public void setLlistaNotes(List<Integer> llistaNotes) {
        this.llistaNotes = llistaNotes;
    }
}
