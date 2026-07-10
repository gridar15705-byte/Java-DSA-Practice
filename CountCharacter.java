import java.util.Scanner;

public class CountCharacter{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = str.length();

        System.out.println("Total Characters: " + count);

        sc.close();
    }
}