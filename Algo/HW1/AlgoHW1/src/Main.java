class Main {
    public static void main(String[] args) {
        binarySearchStart(new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72}, 32);
        binarySearchStart(new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72}, 60);
    }
    public static int binarySearchStart(int[] arr, int number) {
        int middle = 0;
        int lastMiddle = -1;
        int start = 0;
        int finish = arr.length - 1;

        while (middle != lastMiddle && start <= finish) {
            lastMiddle = middle;
            middle = (start + finish) / 2;
            System.out.printf("start: %d, finish: %d, middle: %d\n", start, finish, middle);

            if (arr[middle] <= number) {
                start = middle;
            } else if (arr[middle] > number) {
                finish = middle;
            }
        }
        int result = arr.length - middle - 1;
        System.out.println(result);
        return result;
    }
}