import java.sql.SQLOutput;
import java.util.Scanner;

public class StringStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите 3 строки");
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        String str3=scanner.nextLine();
        try {
            int s1 = Integer.parseInt(str1);
            int s2 = Integer.parseInt(str2);
            int s3 = Integer.parseInt(str3);

            System.out.println(s1 + ", " + s2 + ", " + s3);
        }catch(NumberFormatException nfe) {
            System.out.println("Not valid");
        }
    }
}
