import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int X = 45;
        int Y = 17;
        int Z = 166;
        if (number == X | number == Y | number == Z) {
            System.out.println("Данное значение имеется в константах");
        }
        else
            System.out.println("Такой константы нет!");
    }
}
