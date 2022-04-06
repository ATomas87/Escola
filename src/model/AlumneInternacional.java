package model;

public class AlumneInternacional extends Alumne {

    private String passaport;

    public AlumneInternacional(String nom, String pasaport) {
        super(nom);
        this.passaport = pasaport;
    }

    public String getPassaport() {
        return passaport;
    }

    public void setPassaport(String passaport) {
        this.passaport = passaport;
    }

    @Override
    public Integer calcularNotaFinal() {
        Integer sumaNotes = 0;
        for (int i = 0; i < getLlistaNotes().size(); i++) {
            if (getLlistaNotes().get(i) % 2 == 0) sumaNotes += getLlistaNotes().get(i) * 2;
            else sumaNotes += getLlistaNotes().get(i) / 2;
        }
        return sumaNotes / getLlistaNotes().size();
    }

    @Override
    public String toString() {
        return "L'alumne internacional " + this.getNom()
                + " amb numero d'identificació " + this.getId()
                + " i amb passaport " + this.getPassaport()
                + " té una nota final de " + calcularNotaFinal();
    }
}
