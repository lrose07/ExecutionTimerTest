public class TimerTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(sumTwoNumbers(5, 10));
        long endTime = System.nanoTime();

        System.out.println("duration: " + (endTime - startTime) + " nanoseconds");
    }

    private static int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
