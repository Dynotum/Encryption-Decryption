package encryptdecrypt;

import java.io.*;
import java.util.Arrays;

public class Message {
    private String mode = "enc";
    private int key = 0;
    private String data = "";
    private String in = "";
    private String out = "";

    public Message(String[] args) {

        for (int i = 0; i < args.length; i += 2) {
            final String value = args[i + 1];
            fillValues(args[i], value);
        }
    }

    private void fillValues(String currentArg, String value) {
        switch (currentArg) {
            case "-mode":
                mode = value;
                break;
            case "-key":
                key = Integer.parseInt(value);
                break;
            case "-data":
                data = value;
                break;
            case "-in":
                in = importFile(value);
                break;
            case "-on":
                out = value;
                break;
            default:
                break;
        }
    }

    private void encryptMessage() {
        final String MESSAGE = getMessage();
        final int key = this.key;

        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            newMessage.append((char) (character + key));
        }
        output(newMessage.toString());
    }

    private String getMessage() {
        return data.isEmpty() ? in.isEmpty() ? data : in : data;
    }

    private void decryptMessage() {
        final String MESSAGE = getMessage();
        final int key = this.key;

        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            newMessage.append((char) (character - key));
        }

        output(newMessage.toString());
    }

    private void output(String finalMessage) {
        if (!out.isEmpty()) {
            exportFile(out, finalMessage);
        } else {
            System.out.println(finalMessage);
        }
    }

    public void doAction() {

        switch (mode) {
            case "enc":
                encryptMessage();
                break;
            case "dec":
                decryptMessage();
                break;
            default:
                break;
        }
    }

    private String importFile(String nameFile) {
        final File file = new File(nameFile);
        final StringBuilder stringBuilder = new StringBuilder();
        if (file.exists()) {
            try (var isr = new InputStreamReader(new FileInputStream(file));
                 var br = new BufferedReader(isr)) {

                String line;
                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line);
                }
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
        } else {
            System.out.println("Error : File not found.");
        }
        return stringBuilder.toString();
    }

    private void exportFile(String nameFile, String content) {
        System.out.println(nameFile + " conte " + content);
        try (var file = new FileWriter(nameFile)) {
            file.write(content);
        } catch (Exception e) {
            System.out.println("Error : " + Arrays.toString(e.getStackTrace()));
        }
    }
}