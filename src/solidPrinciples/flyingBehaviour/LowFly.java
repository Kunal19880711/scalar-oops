package solidPrinciples.flyingBehaviour;

public class LowFly implements FlyingBehaviour {
         @Override
         public void fly(String name) {
             System.out.println(name + " is flying low.");
         }

         @Override
         public void glide(String name) {
             System.out.println(name + " is gliding close to the ground.");
         }
     }