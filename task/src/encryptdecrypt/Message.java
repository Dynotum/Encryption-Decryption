package encryptdecrypt;

import static encryptdecrypt.Main.scanner;

public class Message {

    public void encryptMessage() {
        final String MESSAGE = scanner.nextLine();
        final int key = scanner.nextInt();

        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            newMessage.append((char) (character + key));
        }
        System.out.println(newMessage);
    }

    public void descryptMessage() {
        final String MESSAGE = scanner.nextLine();
        final int key = scanner.nextInt();

        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            newMessage.append((char) (character - key));
        }
        System.out.println(newMessage);
    }
}