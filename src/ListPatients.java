import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPatients  {
    private List<Patient> listP;
    public ListPatients(){
        this.listP = new ArrayList<>();
    }
    public void ajouterPatient(Patient p) {
       listP.add(p);
    }
    public void supprimerPatient(Patient p) {
       listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        return listP.stream().anyMatch(patient -> patient.equals(p));
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
         }
    /* Avec l’api Stream */
    public void afficherPatients() {
        listP.forEach(System.out::println);
    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted((p1, p2) -> p1.getNom().compareToIgnoreCase(p2.getNom()))
                .collect(Collectors.toList());
    }
    /* Avec l'api stream */
    public void PatientSansRedondance(){
        /*à completer : Afficher la liste des patients sans redondance*/
        List<Patient> patientsSansRedondance = listP.stream()
                .distinct()
                .collect(Collectors.toList());

        patientsSansRedondance.forEach(System.out::println);
    }
}