package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement{
    public static void main(String[] args) {
        /*Animal animal = new Animal("Canidés", "Loup", 5, true);
        Aquatic aquaticAnimal = new Aquatic("Poissons", "Poisson-Clown", 2, false, "Récif de corail");
        Terrestrial terrestrialAnimal = new Terrestrial("Félins", "Tigre", 8, true, 4);
        Dolphin dolphin = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 25.5f);
        Penguin penguin = new Penguin("Oiseaux", "Pingouin", 3, false, "Antarctique", 100.0f);

        System.out.println(animal);
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();*/

        Zoo zoo = new Zoo("hammamet","test");

        /*Animal animalDolphin1 = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 25.5f);
        zoo.addAquaticAnimal((Aquatic) animalDolphin1);

        Animal animalDolphin2 = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 30.8f);
        zoo.addAquaticAnimal((Aquatic) animalDolphin2);

        Animal animalDolphin3 = new Dolphin("Cétacés", "Dauphin", 9, true, "Océan", 30.8f);
        zoo.addAquaticAnimal((Aquatic) animalDolphin3);

        Animal animalPenguin = new Penguin("Oiseaux", "Pingouin", 3, false, "Antarctique", 100.0f);
        zoo.addAquaticAnimal((Aquatic) animalPenguin);

        Animal secondPenguin = new Penguin("Oiseaux", "Pingouin", 4, false, "Antarctique", 200.0f);
        zoo.addAquaticAnimal((Aquatic) secondPenguin);

        zoo.showAquaticAnimals();

        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : " + maxDepth + " mètres.");

        zoo.displayNumberOfAquaticsByType();

        System.out.println(animalDolphin1.equals(animalDolphin2));
        System.out.println(animalDolphin1.equals(animalDolphin3));*/

        Zoo zoo = new Zoo("Mon Zoo", "hammamet"); // Le zoo a 3 cages
        Animal dolphin = new Dolphin("Mammifère", "Flipper", 5, true, "25.0f");
        Animal penguin1 = new Penguin("Oiseau", "Pingouin1", 3, false, 10.0f);
        Animal penguin2 = new Penguin("Oiseau", "Pingouin2", 4, false, 12.0f);
        Animal penguin3 = new Penguin("Oiseau", "Pingouin3", 2, false, 15.0f);

        try {
            zoo.addAnimal(dolphin);
            System.out.println("Nombre d'animaux après ajout : " + zoo.getNbrAnimals());

            zoo.addAnimal(penguin1);
            System.out.println("Nombre d'animaux après ajout : " + zoo.getNbrAnimals());

            zoo.addAnimal(penguin2);
            System.out.println("Nombre d'animaux après ajout : " + zoo.getNbrAnimals());

            zoo.addAnimal(penguin3);
        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ZooFullException zfe) {
            System.out.println(zfe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Nombre total d'animaux dans le zoo : " + zoo.getNbrAnimals());

    }

}
