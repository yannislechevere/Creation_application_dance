import java.util.ArrayList;

public class Acteur {
    private String prenom;
    private String nom;
    private ArrayList<Film> mesFilms = new ArrayList<>();

    public Acteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return prenom + " " + nom;
    }

    void ajouterFilm(Film f) {
        
        mesFilms.add(f);
    }

    void retirerFilm(Film f) {
        mesFilms.remove(f);
    }


    public boolean equals(Object obj) {
        if (obj instanceof Acteur) {
            Acteur autre = (Acteur) obj;
            return this.nom.equals(autre.nom) && this.prenom.equals(autre.prenom);
        }
        return false;
    }
}
