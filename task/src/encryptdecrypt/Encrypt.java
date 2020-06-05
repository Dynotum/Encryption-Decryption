package encryptdecrypt;

import java.util.Scanner;

public class Encrypt {
    private final int aLowerCase = 97;  // a -> 97
    private final int zLowerCase = 122; // z -> 122  ASCII
    final Scanner scanner = new Scanner(System.in);

    public void encryptMessage() {
        final String MESSAGE = scanner.nextLine();
        final int key = scanner.nextInt();
        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            int currentASCII = character;

            if (currentASCII >= aLowerCase && currentASCII <= zLowerCase) {
                int counter = 1;

                while (counter <= key) {
                    currentASCII++;
                    counter++;
                    if (currentASCII > zLowerCase) {
                        currentASCII = aLowerCase;
                    }
                }
            }
            newMessage.append((char) (currentASCII));
        }
        System.out.println(newMessage);
    }
}
/*    StringBuilder str = new StringBuilder();
    char[] chars = string.toLowerCase().toCharArray();
                    for (char ichar : chars) {
                            if ('a' <= ichar && ichar <= 'z') {
                            ichar = (char) (ichar + step > 'z' ? ichar + step - 1 - 'z' + 'a' : ichar + step);
                            }
                            str.append(ichar);
                            }*/