package mart_16;

public class register {
    public static String lowerUppercase(String name, String surname) {
        String fullName = name + " " + surname;
        StringBuilder formattedString = new StringBuilder();
        boolean capitalize = true;

        for (char c : fullName.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalize = true;
                formattedString.append(c);
            } else {
                formattedString.append(capitalize ? Character.toUpperCase(c) : Character.toLowerCase(c));
                capitalize = false;
            }
        }

        return formattedString.toString();
    }

    public static void main(String[] args) {
        String name = "zIZa";
        String surname = "aLiYevA";
        System.out.println(lowerUppercase(name, surname));
    }
}
