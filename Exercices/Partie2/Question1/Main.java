public class Main {
    public static void main(String[] args) {
        Commercial c1 = new Commercial("5", "vente");
        Commercial c2 = new Commercial("6", "vente");
        
        ZoneGeographique z1 = new ZoneGeographique("france");
        ZoneGeographique z2 = new ZoneGeographique("fevdcz");
        
        Client cl1 = new Client(5, "cndjsk", "fhvcezxnl,d");
        Client cl2 = new Client(57, "ecdvedtnbrgvfecdk", "bgrvfecdsx");
        
        
        c1.ajouterActivite(z1);
        c1.ajouterActivite(z2);
        
        z1.ajouteHabite(cl1);
        z1.ajouteHabite(cl2);

        
    
    
    
    }
}
