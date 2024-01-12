import java.util.Objects;

public class Medecin{
        private int cin;
        private String nom;
        private String prenom;
        private int numOrdre;
        public Medecin(int cin, String nom, String prenom, int numOrdre) {
            this.cin = cin;
            this.nom = nom;
            this.prenom = prenom;
            this.numOrdre = numOrdre;
        }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
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

    public int getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numOrdre=" + numOrdre +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Medecin medecin = (Medecin) object;
        return getCin() == medecin.getCin() && getNumOrdre() == medecin.getNumOrdre() && Objects.equals(getNom(), medecin.getNom()) && Objects.equals(prenom, medecin.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCin(), getNom(), prenom, getNumOrdre());
    }
}