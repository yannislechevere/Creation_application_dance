import java.util.ArrayList;
import java.util.List;

public class Commercial {

    private String identif;
    private String specialite;
    private List<ZoneGeographique> mesZones = new ArrayList<>();


    public Commercial(String identif, String specialite) {
        this.identif = identif;
        this.specialite = specialite;
    }


    public String getIdentif() {
        return identif;
    }


    public void setIdentif(String identif) {
        this.identif = identif;
    }


    public String getSpecialite() {
        return specialite;
    }


    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    private void ajouterZone(ZoneGeographique z) {
        mesZones.add(z);
    }

    public void ajouterActivite(ZoneGeographique z) {
        if (z != null && !mesZones.contains(z)) {
            ajouterZone(z);
        }
        
    }

    public void supprimerActivite(ZoneGeographique z) {
        if (mesZones.size() > 1 && z != null) {
            supprimerZone(z);
        }
        else {
            System.out.println("probleme multipliciter ou null");
        }
    }

    private void supprimerZone(ZoneGeographique z) {
        mesZones.remove(z);
    }

    public String toString() {
        return "Commercial = id :" + identif + "spe :"+ specialite;
    }

    public void afficherListe() {
        for (ZoneGeographique z : mesZones) {
            System.out.println(z);
        }
    }
    public void affiche() {
        System.out.println(this);
        afficherListe();
    }





}