import java.util.Scanner;

public class Operation {

    // Операция плюс (+)
    public static int plus(int[] arrInt){
        return arrInt[0]+arrInt[1];
    }

    // Операция минус (-)
    public static int minus(int[] arrInt){
        return arrInt[0]-arrInt[1];
    }

    // Операция умножения (*)
    public static int multiplication(int[] arrInt){
        return arrInt[0]*arrInt[1];
    }

    // Операция деления (/)
    public static int division(int[] arrInt){
        return arrInt[0]/arrInt[1];
    }

    //Чтение с консоли
    public static String readConsoleValue() {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        return value;
    }

    //Масив чисел из строки
    public static int[] fromStringToInt(String str){
        String[] temp = str.split("[+|-|*|/]");
        return new int[]{Integer.parseInt(temp[0]),Integer.parseInt(temp[1])};
    }
}
