import java.util.Scanner;

public class CaesarCipher {

    // Method to encrypt text
    public static String encrypt(String text, int shift) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // For uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                char encrypted = (char) ((ch - 'A' + shift) % 26 + 'A');
                result += encrypted;
            }
            // For lowercase letters
            else if (ch >= 'a' && ch <= 'z') {
                char encrypted = (char) ((ch - 'a' + shift) % 26 + 'a');
                result += encrypted;
            }
            // For other characters (space, symbols)
            else {
                result += ch;
            }
        }

        return result;
    }

    // Method to decrypt text
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // reverse shift
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}
