import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int size = 100_000_000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 99);
        }
        long startTime;
        startTime = System.currentTimeMillis();
        System.out.println("Stream single sum: " + countArrForEach(arr));
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + " mc.");
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println("Stream parallel sum: " + countArrParallel(arr));
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + " mc.");
        System.out.println();

        startTime = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FJPCounter fjpCounter = new FJPCounter(arr);
        System.out.println("FJP parallel sum: " + forkJoinPool.invoke(fjpCounter));
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + " mc.");
        System.out.println();

    }

    public static class FJPCounter extends RecursiveTask<Integer> {
        private int[] array;

        public FJPCounter(int[] array) {
            this.array = array;
        }

        @Override
        protected Integer compute() {
            if (array.length <= 2) {
                return Arrays.stream(array).sum();
            }
            FJPCounter firstHalfArray = new FJPCounter(Arrays.copyOfRange(array, 0, array.length / 2));
            FJPCounter secondHalfArray = new FJPCounter(Arrays.copyOfRange(array, array.length / 2, array.length));
            firstHalfArray.fork();
            secondHalfArray.fork();
            return firstHalfArray.join() + secondHalfArray.join();
        }
    }

    private static int countArrParallel(int[] arr) {
        return Arrays.stream(arr).parallel().sum();
    }

    public static int countArrForEach(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
