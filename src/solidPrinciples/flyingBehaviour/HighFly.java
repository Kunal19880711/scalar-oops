package solidPrinciples.flyingBehaviour;


public class HighFly implements FlyingBehaviour {
    @Override
    public void fly(String name) {
        System.out.println(name + " is flying high.");
    }

    @Override
    public void glide(String name) {
        System.out.println(name + " is gliding above the clouds.");
    }
}
