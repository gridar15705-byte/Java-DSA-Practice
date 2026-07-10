import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of Words: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Number of Words: " + words.length);
        }

        sc.close();
    }
}