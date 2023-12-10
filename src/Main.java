public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "marwen", "John");
        Etudiant etudiant2 = new Etudiant(2, "Smith", "ali");
        Etudiant etudiant3 = new Etudiant(3, "dsf", "Bob");

        System.out.println("Test avec EspritVector:");
        University espritVectorUniversity = new EspritVector();

        espritVectorUniversity.ajouterEtudiant(etudiant2);
        espritVectorUniversity.ajouterEtudiant(etudiant3);

        System.out.println("Liste d'étudiants avant tri :");
        espritVectorUniversity.displayEtudiants();

        System.out.println("Recherche d'étudiant par nom 'Doe': " + espritVectorUniversity.rechercherEtudiant("Doe"));

        System.out.println("Suppression de l'étudiant 2 :");
        espritVectorUniversity.supprimerEtudiant(etudiant2);
        espritVectorUniversity.displayEtudiants();

        System.out.println("Liste d'étudiants triée par ID :");
        espritVectorUniversity.trierEtudiantsParId();
        espritVectorUniversity.displayEtudiants();

        System.out.println("\nTest avec EspritArrayList:");
        University espritArrayListUniversity = new EspritArrayList();

        espritArrayListUniversity.ajouterEtudiant(etudiant2);
        espritArrayListUniversity.ajouterEtudiant(etudiant3);

        System.out.println("Liste d'étudiants avant tri :");
        espritArrayListUniversity.displayEtudiants();

        System.out.println("Recherche d'étudiant par nom 'Doe': " + espritArrayListUniversity.rechercherEtudiant("Doe"));

        System.out.println("Suppression de l'étudiant 2 :");
        espritArrayListUniversity.supprimerEtudiant(etudiant2);
        espritArrayListUniversity.displayEtudiants();

        System.out.println("Liste d'étudiants triée par nom :");
        espritArrayListUniversity.trierEtudiantsParNom();
        espritArrayListUniversity.displayEtudiants();
    }
}
