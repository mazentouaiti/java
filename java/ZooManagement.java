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
        Animal lion = new Animal("felidae","lion",10,true);
        Zoo myZoo = new Zoo(zooName,"tunis",nbrCages);
        System.out.println("Animal ajouté: " + lion.name + " de la famille " + lion.family + ", âge: " + lion.age + ", mammifère: " + lion.isMammal);
        System.out.println("Zoo créé: " + myZoo.name + " situé à " + myZoo.city + " avec " + myZoo.nbrCages + " cages.");


        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());
    }
}

