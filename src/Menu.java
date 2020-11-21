public class Menu {
    public static void mainMenu() {
        System.out.println("Введите математическую операцию(a + b, a - b, a * b, a / b)");
        System.out.println("Калькулятор подерживает числа на ввод от 0 до 9 также римские числа I-X");
        String value = Operation.readConsoleValue();
        if (Check.checkOfArabic(value)) {
            if (value.indexOf('+') != -1) {
                System.out.println(Operation.plus(Operation.fromStringToInt(value)));
            } else if (value.indexOf('-') != -1) {
                System.out.println(Operation.minus(Operation.fromStringToInt(value)));
            } else if (value.indexOf('*') != -1) {
                System.out.println(Operation.multiplication(Operation.fromStringToInt(value)));
            } else if (value.indexOf('/') != -1) {
                System.out.println(Operation.division(Operation.fromStringToInt(value)));
            }
        }else if (Check.chekOfRoman(value)) {
            System.out.println(RomanFormat.operation(value));
        }else {
            System.out.println("Неверно ведено выражение введите в формате([1-10][+,-,*,/][1-10] или [I-X][+,-,*,/][I-X]");
        }


        }
    }

