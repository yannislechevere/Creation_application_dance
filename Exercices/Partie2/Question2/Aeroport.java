public class Aeroport {
    private String indent;
    private String nom;

    public Aeroport(String indent, String nom) {
        this.indent = indent;
        this.nom = nom;
    }

    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
