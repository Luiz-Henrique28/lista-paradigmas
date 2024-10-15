import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int sumEvan = 0;
        int countOdd = 0;

        System.out.println("Digite 6 numeros inteiros: ");

        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("numeros pares digitados: ");

        for (int num : numbers) {
            if(num % 2 == 0) {
                System.out.println(num + " ");
                sumEvan += num;
            }
        }

        System.out.println();

        System.out.println("soma dos numeros pares: " + sumEvan);

        System.out.println("numeros impares digitados: ");
        for (int num : numbers){
            if(num % 2 != 0){
                System.out.println(num + " ");
                countOdd++;
            }
        }
        System.out.println("quantidade de numeros impares "+ countOdd);
    }
}