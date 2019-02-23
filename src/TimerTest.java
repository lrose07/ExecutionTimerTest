public class TimerTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long startTime = System.nanoTime();
            int sum = sumTwoNumbers(i*4, 2*i+3);
            long endTime = System.nanoTime();

            System.out.println("Sum of " + (i * 4) + " and " + (2 * i + 3) + " is " + sum);
            System.out.println("duration: " + (endTime - startTime) + " nanoseconds\n");
        }
    }

    private static int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
