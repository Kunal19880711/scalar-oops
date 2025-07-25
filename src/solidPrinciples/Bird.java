package solidPrinciples;

public abstract class Bird {
    private String name;
    private String type;

   public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();

    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
   }
}
