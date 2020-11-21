import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

    //Проверка на правильность ввода
    public static boolean validationOfInput (String value){
        if (checkOfArabic(value)&&chekOfRoman(value)){
            return true;
        }
        return false;
    }

    // Проверка арабских чисел
    public static boolean checkOfArabic (String value){
        String regex = "[0-9]([0])?[+|-|*|/][0-9]([0])?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    // Проверка румынских чисел
    public static boolean chekOfRoman (String value){
        String regex = "(X|IX|IV|V?I{0,3})[+|-|*|/](X|IX|IV|V?I{0,3})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    //Проверка на выход из программы
    public static boolean checkExit() {
        System.out.println("Чтобы выполниль еще одну операцию введите: 1");
        System.out.println("чтобы закрыть програму введите: 2");
        String value = Operation.readConsoleValue();
        if (value.equalsIgnoreCase("1")) {
            return true;
        } else if (value.equalsIgnoreCase("2")) {
            return false;
        } else {
            System.out.println("Некоректрый ввод, попробуйте еще раз");
            checkExit();

            return true;
        }
    }
}
