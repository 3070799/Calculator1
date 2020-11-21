import java.util.TreeMap;

public class RomanFormat {
    private static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
    }

    //Перевод арабских чисел в румынские
    public static String intToRoman(int number){
        int i = map.floorKey(number);
        if(number == i){
            return map.get(number);
        }
        return map.get(i) + intToRoman(number-i);
    }

    //Перевод румынских чисел в арабские
    public static int romanToInt (String s){
        char [] arrChar = s.toCharArray();
        int [] arrInt = new int[arrChar.length];
        int result = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == 'I'){
                arrInt[i] = 1;
            }else if (arrChar[i] == 'V'){
                arrInt[i] = 5;
            }else if (arrChar[i] == 'X'){
                arrInt[i] = 10;
            }else if (arrChar[i] == 'L'){
                arrInt[i] = 50;
            }else if (arrChar[i] == 'C'){
                arrInt[i] = 100;
            }else if (arrChar[i] == 'D'){
                arrInt[i] = 500;
            }else if (arrChar[i] == 'M'){
                arrInt[i] = 1000;
            }
        }
        for (int i = 1; i < arrInt.length; i++) {
            if(arrInt[i-1]<arrInt[i]){
                arrInt[i-1] = -arrInt[i-1];
            }
        }
        for (int i = 0; i < arrInt.length; i++) {
            result += arrInt[i];

        }
        return result;
    }

    //строку римских чисел в масив арабских
    public static int[] fromStringToInt(String str){
        String[] temp;
        temp = str.split("[+|-|*|/]");
        return new int[]{romanToInt(temp[0]),romanToInt(temp[1])};
    }

    //операция с румынскими числами
    public static String operation(String str) {
        int a = fromStringToInt(str)[0];
        int b = fromStringToInt(str)[1];
        int result=0;

        if (str.indexOf('+') != -1) {
            result = a+b;
        } else if (str.indexOf('-') != -1) {
            result = a-b;
        } else if (str.indexOf('*') != -1) {
            result = a*b;
        } else if (str.indexOf('/') != -1) {
            result = a/b;
        }

        return intToRoman(result);
    }
}
