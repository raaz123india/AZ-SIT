public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 100;

        System.out.println("Prime numbers between 1 and " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
