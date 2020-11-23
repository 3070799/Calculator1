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
        if (arrInt[1] == 0){
            System.out.println("На ноль делить нельзя!");
            return 0;
        }
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

    //операция с арабскими числами
    public static int allOperation(String str){

        if (str.indexOf('+') != -1) {
            return plus(fromStringToInt(str));
        } else if (str.indexOf('-') != -1) {
           return minus(fromStringToInt(str));
        } else if (str.indexOf('*') != -1) {
            return multiplication(fromStringToInt(str));
        } else if (str.indexOf('/') != -1) {
            return division(fromStringToInt(str));
        }
        return 0;
    }
}
