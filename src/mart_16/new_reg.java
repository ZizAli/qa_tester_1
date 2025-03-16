package mart_16;

import java.util.Scanner;

public class new_reg {
    public static String upperLowercase(String word) {
        StringBuilder formattedString = new StringBuilder();
        boolean capitalize = true;

        for (char c : word.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalize = true;
                formattedString.append(c);
            } else {
                formattedString.append(capitalize ? Character.toUpperCase(c) : Character.toLowerCase(c));
                capitalize = false;

//                if (capitalize) {
//                    formattedString.append(Character.toUpperCase(c));
//                } else {
//                    formattedString.append(Character.toLowerCase(c));
//                }


            }
        }

        return formattedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız: ");
        String name = scanner.nextLine();

        System.out.print("Soyadınız: ");
        String surname = scanner.nextLine();

        scanner.close();

        System.out.println(upperLowercase(name) + " " + upperLowercase(surname));
    }
}
