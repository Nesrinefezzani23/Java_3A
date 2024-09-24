public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;
    int nbrAnimals;
    public Zoo (String name,String city)
    {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
    }
    public void displayZoo() {
        System.out.println("Animaux dans le zoo " + name + " :");
        for (int i = 0; i < nbrAnimals; i++) {
            Animal animal = animals[i];
            System.out.println("Famille: " + animal.family + ", Nom: " + animal.name +
                    ", Âge: " + animal.age + ", Mammifère: " + animal.isMammal);
        }
    }
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
            return false;
        }
        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            System.out.println("Impossible d'ajouter l'animal. Le zoo est plein.");
            return false;
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int deletedIndex = searchAnimal(animal);
        animals[deletedIndex] = null;
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;

    }

    @Override
    public String toString() {
        return "name : " + name + " city : " + city + "nbrCages : " + nbrCages + "animals numbers  : " + nbrAnimals;

    }
    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }

    ublic static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            System.out.println("Le zoo avec le plus d'animaux est : " + z1.name);
            return z1;
        } else if (z1.nbrAnimals < z2.nbrAnimals) {
            System.out.println("Le zoo avec le plus d'animaux est : " + z2.name);
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux : " + z1.nbrAnimals);
            return null;
        }
    }
}
