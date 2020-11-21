public class Menu {
    public static void mainMenu() {
        System.out.println("Для выхода из программы введите - Exit");
        System.out.println("Калькулятор подерживает числа на ввод от 0 до 10 также римские числа I-X");
        System.out.println("Введите математическую операцию(a + b, a - b, a * b, a / b)");
        String value = Operation.readConsoleValue();   //Чтение с консоли
        if (Check.checkOfArabic(value)&&Operation.fromStringToInt(value)[0]<= 10 && Operation.fromStringToInt(value)[1]<= 10) {   //Проверка на правильность ввода арабских чисел
            System.out.println(Operation.allOperation(value));
        }else if (Check.chekOfRoman(value)) {   //Проверка на правильность ввода римских чисел
            System.out.println(RomanFormat.operation(value));
        }else if (value.equalsIgnoreCase("exit")){   //проверка на выход из программы
            Check.checkExit = false;
        }
            else {   //Ошибка при неправильном вводе и возврат в начало программы
            System.out.println("Неверно ведено выражение, введите в формате([1-10][+,-,*,/][1-10] или [I-X][+,-,*,/][I-X]");
            mainMenu();
        }


        }
    }

