public class ZooManagement{
    public static void main(String[] args) {
        Animal lion=new Animal("Félins","Simba",5,true);
        lion.displayAnimal();
        Animal elephant= new Animal("Éléphantidés", "Babar", 10, true);
        Animal giraffe= new Animal("Ruminants", "Olga", 7, true);

        Zoo myZoo=new Zoo("Central Park Zoo","Madagascar");
        myZoo.displayZoo();

        int indiceLion = myZoo.searchAnimal(lion);
        System.out.println("Lion trouvé à l'indice : " + indiceLion);

        Animal secondLion = new Animal("Félins", "Mufasa", 5, false);
        int indiceSecondLion = myZoo.searchAnimal(secondLion);
        System.out.println("Autre lion trouvé à l'indice : " + indiceSecondLion);

        Animal giraffe2=new Animal("Ruminants", "Olga", 7, true);
        System.out.println(myZoo.addAnimal(giraffe2));

        Animal tiger = new Animal("Félins", "Tigrou", 4, false);
        myZoo.removeAnimal(tiger);

        System.out.println("Le zoo est plein : " + myZoo.isZooFull());

        Zoo largerZoo= Zoo.comparerZoo(zoo1, zoo2);

        /*lion.family="Félins";
        lion.name="Simba";
        lion.age=5;
        lion.isMammal=true;*/
        /*myZoo.name="Central Park Zoo";
        myZoo.city="Madagascar";
        myZoo.nbrCages=23;*/
    }
}
