import java.util.List;
import java.util.ArrayList;

public class ZoneGeographique {

    private String nom;
    private List<Client> mesClient = new ArrayList<>();

    public ZoneGeographique(String nom) {
        this.nom = nom;
    }
  
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private void ajouteClient(Client c) {
        mesClient.add(c);
    }

    public void ajouteHabite(Client c) {
        if (c != null && !mesClient.contains(c)) {
            ajouteClient(c);
        }
        else {
            System.out.println("null");
        }
    }

    private void supprimerClient(Client c) {
        mesClient.remove(c);
    }

    public void supprimerHabite(Client c) {
        if (c != null) {
            supprimerClient(c);
        }
        else {
            System.out.println("null");
        }
        
    }

    public String toString() {
        return "ZoneGeographique [nom=" + nom + ", mesClient=" + mesClient + "]";
    }

    public void afficheListe() {
        for (Client c : mesClient) {
            System.out.println(c);
        }
    }

    public void afficher() {
        System.out.println(this);
        afficheListe();
    }




}