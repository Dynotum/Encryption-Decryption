package encryptdecrypt;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String inputMessage = scanner.nextLine();
        doAction(inputMessage);
    }

    private static void doAction(String inputMessage) {
        final Message message = new Message();

        switch (inputMessage) {
            case "enc":
                message.encryptMessage();
                break;
            case "dec":
                message.descryptMessage();
                break;
            default:
                break;
        }
    }
}