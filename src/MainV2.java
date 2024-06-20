import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку'a' ");
        String a = in.next();

        System.out.println("Введите строку'b' ");
        String b = in.next();

        String lengh;
        if (a.length() == b.length()){
            lengh = "Строки идентичны";
        } else {
            lengh = "Строки неидентичны";
        }

        System.out.println(lengh);

    }
}
