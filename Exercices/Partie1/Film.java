import java.util.ArrayList;

public class Film {
    
    private String titre;
    private int duree;
    private String nationalite;
    private String resume;
    private ArrayList<Acteur> mesActeurs = new ArrayList<>();
    private ArrayList<Seance> meSeances = new ArrayList<>();

    
    public Film(String titre, int duree, String nationalite, String resume) {
        this.titre = titre;
        this.duree = duree;
        this.nationalite = nationalite;
        this.resume = resume;
    }


    public String getTitre() {
        return titre;
    }


    public void setTitre(String titre) {
        this.titre = titre;
    }


    public int getDuree() {
        return duree;
    }


    public void setDuree(int duree) {
        this.duree = duree;
    }


    public String getNationalite() {
        return nationalite;
    }


    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }


    public String getResume() {
        return resume;
    }


    public void setResume(String resume) {
        this.resume = resume;
    }

    public boolean equals(Film f) {
        return this == f;
    }

    public String toString() {
        return titre + " Film " + nationalite + " de " + duree + " mn \nRésumé : " +resume;
    }


    private boolean contientActeur(Acteur a) {
        return mesActeurs.contains(a);
    }

    private void ajouterActeur(Acteur a) {
        mesActeurs.add(a);
    }

    private void enleverActeur(Acteur a) {
        mesActeurs.remove(a);
    }

    public void ajouterJouer(Acteur a) {
        if (a == null) {
            System.out.println("Erreur : Acteur null");
        }
        else if (contientActeur(a)) {
            System.out.println("Erreur : Acteur déjà présent");
        }
        else {
            ajouterActeur(a);
            a.ajouterFilm(this);
        }
    }
    
    public void listerActeurs() {
        for (Acteur a : mesActeurs) {
            System.out.println(a);
        }
    }

    public void enleverJouer(Acteur a) {
        if (a == null) {
            System.out.println("Erreur : Acteur null");
        }
        else if (!mesActeurs.contains(a)) {
            System.out.println("Erreur : Acteur non présent");
        }
        else {
            enleverActeur(a);
            a.retirerFilm(this);
        }
    }

   

    public void ajouterSeance(Seance s) {
        if (s != null) {
            meSeances.add(s);
        }
    }

    public void affiche() {
        System.out.println(titre + " Film " + nationalite + " de " + duree + " mn");
        System.out.println("Résumé : " + resume);
        System.out.println("Acteurs :");
        listerActeurs();
    }

}
