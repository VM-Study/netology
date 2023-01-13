import java.util.concurrent.*;

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () -> {
            System.out.println("one " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
            Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 3000));
            System.out.println("two " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
            Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 3000));
            System.out.println("three " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
            Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 3000));
            return 3;
        };
        ExecutorService service = Executors.newFixedThreadPool(4, r -> new Thread(r, "MySupperThread"));

        for (int i = 0; i < 4; i++) {
            Future<Integer> future = service.submit(task);
            //System.out.println("Answer = " + future.get());
        }

        //service.invokeAny(task);
        service.shutdown();
    }
}
