public class Factorial {
    public static int factorial(int a) {
        if (a == 1) {
            return a;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static void main(String[] args) {
        String input = System.console().readLine("Masukkan Bilangan: ");
        int bilangan = Integer.parseInt(input);

        int hasil = factorial(bilangan);
        System.out.printf("%d! = %d\n", bilangan, hasil);
    }
}

