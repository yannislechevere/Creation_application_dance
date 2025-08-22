import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {

        Film film1 = new Film("BIS", 102, "francais", "Éric et Patrice sont amis depuis le lycée. Au fil des années, chacun a pris un chemin très différent : d’un côté Éric, hédoniste sans attaches aux multiples conquêtes, et de l’autre Patrice, père de famille «monogame» à la vie bien rangée.");
        Acteur Franck = new Acteur("Franck", "Dubosc");
        Acteur Kad = new Acteur("Kad", "Merad");
        Acteur Alexandra = new Acteur("Alexandra", "Lamy");
        film1.ajouterJouer(Franck);
        film1.ajouterJouer(Kad);
        film1.ajouterJouer(Alexandra);

        Film film2 = new Film("PAPA OU MAMAN", 104, "francais", "Florence et Vincent Leroy ont tout réussi. Leurs métiers, leur mariage, leurs enfants. Et aujourd’hui, c’est leur divorce qu’ils veulent réussir.");
        Acteur Marina = new Acteur("Marina", "Foïs");
        Acteur Laurent = new Acteur("Laurent", "Lafitte");
        film2.ajouterJouer(Marina);
        film2.ajouterJouer(Laurent);


        ArrayList<Seance> mesSeance;
        Seance matine = new Seance("18/03/2017", "matinée");
        Seance debut_apres_midi = new Seance("18/03/2017", "début après-midi");
        Seance fin_apres_midi = new Seance("18/03/2017", "fin après-midi");
        Seance soiree = new Seance("18/03/2017", "soirée");
        mesSeance = new ArrayList<>();
        mesSeance.add(matine);
        mesSeance.add(debut_apres_midi);
        mesSeance.add(fin_apres_midi);
        mesSeance.add(soiree);

        matine.ajouterProgrammer(film1);
        soiree.ajouterProgrammer(film1);

        debut_apres_midi.ajouterProgrammer(film2);

        for (Seance s :  mesSeance) {
            s.affiche();
        }
            


    }
}
