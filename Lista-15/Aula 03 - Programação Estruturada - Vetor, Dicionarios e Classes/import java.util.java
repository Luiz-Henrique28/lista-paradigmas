import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int sumEven = 0;
        int countOdd = 0;

        System.out.println("Digite 6 numeros inteiros:");

        // Receber os nÃºmeros do usuÃ¡rio
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("NÃºmeros pares digitados: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                sumEven += num;
            }
        }
        System.out.println();

        System.out.println("Soma dos numeros pares: " + sumEven);

        System.out.print("Numeros impares digitados: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                countOdd++;
            }
        }
        System.out.println();

        System.out.println("Quantidade de nÃºmeros impares: " + countOdd);
    }
}
