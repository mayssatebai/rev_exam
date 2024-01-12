import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Hopital {
    public TreeMap<Medecin, List<Patient>> medecinPatients;

    public Hopital() {
        this.medecinPatients = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ArrayList<>());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            List<Patient> patients = medecinPatients.get(m);
            patients.add(p);
        } else {
            // Gérer le cas où le médecin n'est pas dans la map (à votre discrétion)
        }
    }

    /* Avec l'API Stream */
    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin);
            System.out.println("Patients: " + patients);
        });
    }

    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedecinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            List<Patient> patients = medecinPatients.get(m);
            System.out.println("Patients du médecin " + m.getNom() + " " + m.getPrenom() + ": " + patients);
        } else {
            System.out.println("Ce médecin n'a pas de patients.");
        }
    }

    /* Retourner les noms des patients dont le "numSecuriteSociale = 1" */
    public List<String> retournerNomPatients() {
        return medecinPatients.values().stream()
                .flatMap(List::stream)
                .filter(patient -> patient.getNumSecuriteSociale() == 1)
                .map(Patient::getNom)
                .collect(Collectors.toList());
    }
}
