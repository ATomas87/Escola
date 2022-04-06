package model;

public class AlumneNacional extends Alumne {

    private String dni;

    public AlumneNacional(String nom, String dni) {
        super(nom);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public Integer calcularNotaFinal() {
        Integer sumaNotes = 0;
        for (int i = 0; i < getLlistaNotes().size(); i++) {
            if (getLlistaNotes().get(i) >= 5) sumaNotes += getLlistaNotes().get(i) / 2;
            else sumaNotes += getLlistaNotes().get(i);
        }
        return sumaNotes / getLlistaNotes().size();
    }

    @Override
    public String toString() {
        return "L'alumne nacional " + this.getNom()
                + " amb numero d'identificació " + this.getId()
                + " i amb DNI " + this.getDni()
                + " té una nota final de " + calcularNotaFinal();
    }
}
