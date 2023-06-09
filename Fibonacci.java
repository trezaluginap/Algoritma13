public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        String input = System.console().readLine("Masukkan Batas Deret Bilangan Fibonacci: ");
        int x = Integer.parseInt(input);

        System.out.println("Deret Fibonacci:");
        for (int i = 0; i < x; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

