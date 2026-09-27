import java.util.Scanner;

public class ReverseStringAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word to reverse: ");
        String original = scanner.nextLine();
        
        String reversed = new StringBuilder(original).reverse().toString();
        
        System.out.println("Reversed word: " + reversed);
        
        scanner.close();
    }
}
