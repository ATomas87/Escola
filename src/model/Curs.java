package model;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String nom;
    private List<Alumne> alumnes;

    public Curs(String nom) {
        this.nom = nom;
        this.alumnes = new ArrayList<Alumne>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Alumne> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(List<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    public void insertaAlumne(Alumne alumne) {
        this.alumnes.add(alumne);
    }

    public void eliminaAlumne(Integer id) {
        boolean alumneEliminat = this.alumnes.removeIf(alumne -> alumne.getId().equals(id));
        if (!alumneEliminat){
            System.out.println("Error: L'alumne amb id " + id + " no és a la llista d'alumnes.");
        }
    }

    public Integer buscaAlumne(Integer id) {
        return this.alumnes.stream()
                .filter(alumne -> alumne.getId().equals(id))
                .findFirst()
                .get()
                .getId();
    }

    public void mostraNomAlumnes() {
        this.alumnes.forEach(alumne -> System.out.println(alumne.getNom()));
    }
}
