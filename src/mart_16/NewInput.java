package mart_16;

public class NewInput {
    public static String lowerUppercase(String name) {
        StringBuilder formattedString = new StringBuilder();
        boolean capitalize = true;

        for (char c : name.toCharArray()) {
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
        String userInput = "aZizA AliYEVa IsbANDiyaR qIZI";
        System.out.println(lowerUppercase(userInput));
    }
}
