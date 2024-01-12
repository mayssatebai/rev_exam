import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setMedecins;

    public SetMedecins() {
        this.setMedecins = new HashSet<>();
    }

    public void ajouterMedecin(Medecin medecin) {
        setMedecins.add(medecin);
    }

    public void supprimerMedecin(Medecin medecin) {
        setMedecins.remove(medecin);
    }

    public boolean rechercherMedecin(Medecin medecin) {
        return setMedecins.contains(medecin);
    }

    public boolean rechercherMedecinParCIN(int cin) {
        return setMedecins.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }

    public void afficherMedecins() {
        setMedecins.forEach(System.out::println);
    }

    public void trierMedecinsParNom() {
        setMedecins = setMedecins.stream()
                .sorted((m1, m2) -> m1.getNom().compareToIgnoreCase(m2.getNom()))
                .collect(Collectors.toSet());
    }

    public void medecinSansRedondance() {
        Set<Medecin> medecinsSansRedondance = setMedecins.stream()
                .distinct()
                .collect(Collectors.toSet());

        medecinsSansRedondance.forEach(System.out::println);
    }
}
