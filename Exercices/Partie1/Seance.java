

public class Seance {
    private String date;
    private String typeSeance;
    private Film monFilm;

    public Seance(String date, String typeSeance) {
        this.date = date;
        this.typeSeance = typeSeance;
    }

    
    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getTypeSeance() {
        return typeSeance;
    }


    public void setTypeSeance(String typeSeance) {
        this.typeSeance = typeSeance;
    }


    private void affecterFilm(Film f) {
        this.monFilm = f;
    }
    public void ajouterProgrammer(Film f) {
        if (f != null) {
           affecterFilm(f);
        }
    }

    private void enleverFilm(Film f) {
        this.monFilm = null;
    }

    public void enleverProgrammer(Film f) {
        if (f == null) {
            System.out.println("Ereur : Film null");
        }
        else {
            enleverFilm(f);
        }
        
    }

    public boolean equals(Film f) {
        return this.monFilm == f;
    }

    public void affiche() {
        if (monFilm != null) {
            System.out.println(date + " - " + typeSeance);
        } 
        else {
            System.out.println("Aucun film programmer.");
        }
    }

    
}
