package threadPools;

import java.util.concurrent.Callable;

public class NumberMultiplier implements Callable<Integer> {
    int number;

    public NumberMultiplier(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number * 10; // Multiply the number by 10
    }
}
