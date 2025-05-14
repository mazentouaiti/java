import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Entrez le nom du zoo : ");
            zooName = scanner.nextLine();
            System.out.print("Entrez le nombre de cages : ");
            nbrCages = scanner.nextInt();

            if (nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être supérieur à zéro. Réessayez.");
                return;
            }

            System.out.println(zooName + " comporte " + nbrCages + " cages.");
        } catch (Exception e) {
            System.out.println("Entrée invalide. Veuillez entrer des données correctes.");
        } finally {
            scanner.close();
        }
    }
}

