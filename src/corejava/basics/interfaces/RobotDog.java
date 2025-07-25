package corejava.basics.interfaces;

public class RobotDog implements Runner {
    private String name;
    private String model;

    public RobotDog(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        System.out.println("RobotDog: " + name + " is running.");
    }
}
