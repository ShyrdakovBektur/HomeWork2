import java.util.Random;

public class Main {
    public static void main(String[] args) {


        System.out.println(canGoForAWalk(13, 19));
        System.out.println(canGoForAWalk(34, 14));
        System.out.println(canGoForAWalk(22, -9));
        System.out.println(canGoForAWalk(50, 43));
        System.out.println(canGoForAWalk(59, 26));


    }

    public static String canGoForAWalk(int age, int temperature) {
        if ((age >= 15 && age <= 40 && temperature >= -25 && temperature <= 30) ||
                (age < 23 && temperature >= 0 && temperature <= 29) ||
                (age > 43 && temperature >= -16 && temperature <= 25)) {
            return "Можно идти гулять";
        } else ;
        {
            return "Остовайтесь дома!";
        }





        }
    }