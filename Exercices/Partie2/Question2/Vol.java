import java.util.ArrayList;
import java.util.List;


public class Vol {
    private int numVol;
    private Aeroport monAeroport;
    private List<Vol> mesVol = new ArrayList<>();

    public Vol(int numVol) {
        this.numVol = numVol;
    }

    public int getNumVol() {
        return numVol;
    }

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }

    public Aeroport getMonAeroport() {
        return monAeroport;
    }
    
    public void ajouteMonAeroport(Aeroport a) {
        monAeroport = a;
    }

    public void ajouteDestination(Aeroport a) {
        if(a != null) {
            monAeroport.ajouteMonAeroport(a);
        }
    }

    public void ajoutePersonne(Vol v) {
        mesVol.add(v);
    }

    public void ajouteVol(Vol v) {
        if (v != null) {
            
        }
    }

    public String toString() {
        return "Vol [numVol=" + numVol + ", monAeroport=" + monAeroport + "]";
    }

    public void affiche() {
        System.out.println(this);
    }

}
