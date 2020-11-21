import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean checkExit = true;
        while (checkExit) {
            Menu.mainMenu();
            checkExit = Check.checkExit();
        }



    }
}
