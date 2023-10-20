public class DivisibilityCheck {
    public static void main(String[] args) {
        int number = 12;

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        } else {
            System.out.println(number + " is not divisible by 2 and 3.");
        }
    }
}