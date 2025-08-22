public class Client {
    
    private int numero;
    private String nom;
    private String adresse;
    private ZoneGeographique maZone;

    public Client(int numero, String nom, String adresse) {
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void affiche() {
        System.out.println("Client [numero=" + numero + ", nom=" + nom + ", adresse=" + adresse + "zone = " +maZone +"]");
    }

}
