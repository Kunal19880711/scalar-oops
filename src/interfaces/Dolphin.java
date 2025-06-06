package interfaces;

public class Dolphin extends Animal{
    private String species;

    public Dolphin(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Dolphin: " + getName() + " is eating fish.");
    }
}
