import model.*;

public class Main {
    public static void main(String[] args) {

        /* 1) Crea un curs anomenat “Fonaments de la programació” */
        Curs fonamentsProgramacio = new Curs("Fonaments de la programació");

        /* 2) Crea un alumne nacional que es digui “Marc” amb Id 1 i DNI “12345678A”
         * 3) Crea un alumne nacional que es digui “Laia” amb Id 2 i DNI “98765432B”
         * 4) Crea un alumne Erasmus que es digui “Peter” amb Id 3 i PASSAPORT “ABC123456”
         * 5) Crea un alumne Erasmus que es digui “Kate” amb Id 4 i PASSAPORT “DEF654321” */
        AlumneNacional marc = new AlumneNacional("Marc", "12345678A");
        AlumneNacional laia = new AlumneNacional("Laia", "98765432B");
        AlumneInternacional peter = new AlumneInternacional("Peter", "ABC123456");
        AlumneInternacional kate = new AlumneInternacional("Kate", "DEF654321");

        /* 6) Insereix els 4 alumnes al curs “Fonaments de la programació” */
        fonamentsProgramacio.insertaAlumne(marc);
        fonamentsProgramacio.insertaAlumne(laia);
        fonamentsProgramacio.insertaAlumne(peter);
        fonamentsProgramacio.insertaAlumne(kate);

        /* 7) Mostra els noms de tots els alumnes del curs */
        fonamentsProgramacio.mostraNomAlumnes();

        /* 8) Insereix les notes 1, 3, 5, 7 i 9 a l’alumne Marc */
        Integer[] notesMarc = new Integer[]{1, 3, 5, 7, 9};

        for (Integer nota : notesMarc) {
            marc.insertarNota(nota);
        }

        /* 9) Insereix les notes 2, 4, 6, 8, 10 a l’alumne Laia */
        Integer[] notesLaia = new Integer[]{2, 4, 6, 8, 10};

        for (Integer nota : notesLaia) {
            laia.insertarNota(nota);
        }

        /* 10) Insereix les notes 1,2,5,6,9,10 a l’alumne Peter */
        Integer[] notesPeter = new Integer[]{1, 2, 5, 6, 9, 10};

        for (Integer nota : notesPeter) {
            peter.insertarNota(nota);
        }

        /* 11) Insereix les notes 3,4,7,8 a l’alumne Kate */
        Integer[] notesKate = new Integer[]{3, 4, 7, 8};

        for (Integer nota : notesKate) {
            kate.insertarNota(nota);
        }

        /* 12) Calcula i imprimeix les notes finals de cada alumne juntament amb el seu nom i el seu */
        fonamentsProgramacio.getAlumnes()
                .forEach(System.out::println);

        /* 13) Elimina l’alumne Marc amb id1 */
        fonamentsProgramacio.eliminaAlumne(1);

        /* 14) Canvia el nom de Peter per Jason */
        fonamentsProgramacio.getAlumnes().stream()
                .filter(alumne -> alumne.getNom().equals("Peter")).findFirst()
                .get().setNom("Jason");

        /* 15) Mostra els noms de tots els alumnes del curs */
        fonamentsProgramacio.mostraNomAlumnes();
    }
}
