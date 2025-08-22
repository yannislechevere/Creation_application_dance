import java.util.ArrayList;
import java.util.List;

public class Personne {
    private String numPasseport;
    private String nom;
    private String prenom;
    private List<Vol> mesVol = new ArrayList<>();
    
    public Personne(String numPasseport, String nom, String prenom) {
        this.numPasseport = numPasseport;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNumPasseport() {
        return numPasseport;
    }

    public void setNumPasseport(String numPasseport) {
        this.numPasseport = numPasseport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String toString() {
        return "Personne [numPasseport=" + numPasseport + ", nom=" + nom + ", prenom=" + prenom + ", mesVol=" + mesVol
                + "]";
    }



}
