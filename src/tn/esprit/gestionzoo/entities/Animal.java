package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal (String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        setAge(age);
        this.isMammal=isMammal;
    }
    public void displayAnimal()
    {
        System.out.println(this.name);
        System.out.println(this.family);
        System.out.println(this.age);
        System.out.println(this.isMammal);
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge d'un animal ne peut pas être négatif.");
        }
    }
}
