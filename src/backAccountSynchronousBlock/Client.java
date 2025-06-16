package backAccountSynchronousBlock;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John Doe");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            System.out.printf("[Initial state] Bank [name=%s, balance=%.2f]\n",
                    bankAccount.getName(), bankAccount.getBalance());

            ArrayList<Future<Void>> futures = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                int amount = (i + 1) * 100; // Deposit amounts of 100, 200, ..., 1000
                Future<Void> depositFuture = executorService.submit(() -> {
                    bankAccount.deposit(amount);
                    return null; // Return null as we are not interested in the result
                });
                futures.add(depositFuture);
            }

            for (int i = 0; i < 100; i++) {
                int amount = (i + 1) * 100; // Deposit amounts of 100, 200, ..., 1000
                Future<Void> withdrawalFuture = executorService.submit(() -> {
                    bankAccount.withdrawal(amount);
                    return null; // Return null as we are not interested in the result
                });
                futures.add(withdrawalFuture);
            }

            for (Future<Void> future : futures) {
                future.get(); // Wait for all tasks to complete
            }

            System.out.printf("[Final state] Bank [name=%s, balance=%.2f]\n",
                    bankAccount.getName(), bankAccount.getBalance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}
