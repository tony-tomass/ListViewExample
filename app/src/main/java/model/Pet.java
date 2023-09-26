package model;

public class Pet {

    String name, breed;
    int age;

    public Pet(String thisName, String thisBreed, int thisAge) {
        name = thisName;
        breed = thisBreed;
        age = thisAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return name + " (" + breed + "): " + age;
    }

}
