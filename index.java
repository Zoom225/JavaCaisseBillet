import java.util.Scanner;
/*Ecrire un programme de caisse enregistreuse qui demande à l'u lisateur d'encoder le prix des divers achats du client.
 Lorsque l'u lisateur encode 0, le programme affiche le montant total. Ensuite, le programme demande à l'u lisateur d'encoder la somme en liquide remise par le client (qui doit être >= total). Le programme affiche le nombre de billets/pièces qui doivent être 
 rendu sachant il n'existe que des billets/pièces de 1, 2 et 10 euros le programme rend le minimum de billets/pièces*/
public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialisation des variables
        double total = 0;

        // Saisie des prix des achats
        System.out.println("Entrez le prix des achats (tapez 0 pour terminer) :");

        double prixProduit;
        do {
            System.out.print("Prix du produit (ou 0 pour terminer) : ");
            prixProduit = scanner.nextDouble();

            // Ajout du prix du produit au total
            total += prixProduit;

        } while (prixProduit != 0);

        // Affichage du montant total
        System.out.println("Montant total des achats : " + total + " euros");

        // Saisie de la somme en liquide remise par le client
        double sommeLiquide;
        do {
            System.out.print("Entrez la somme en liquide remise par le client : ");
            sommeLiquide = scanner.nextDouble();

            // Vérification que la somme en liquide est suffisante
            if (sommeLiquide < total) {
                System.out.println("La somme en liquide doit être supérieure ou égale au total des achats.");
            }

        } while (sommeLiquide < total);

        // Calcul et affichage de la monnaie à rendre
        double monnaie = sommeLiquide - total;
        System.out.println("Monnaie à rendre : " + monnaie + " euros");

        // Calcul du nombre de billets/pièces à rendre
        int billets10 = (int) (monnaie / 10);
        monnaie %= 10;

        int billets2 = (int) (monnaie / 2);
        monnaie %= 2;

        int pieces1 = (int) monnaie;

        // Affichage du rendu de monnaie
        System.out.println("Rendu de monnaie :");
        System.out.println("Billets de 10 euros : " + billets10);
        System.out.println("Billets de 2 euros : " + billets2);
        System.out.println("Pièces de 1 euro : " + pieces1);

        // Fermeture du scanner
        scanner.close();
    }
}
