package encryptdecrypt;

public class Message {
    private String mode = "enc";
    private int key = 0;
    private String data = "";

    public Message(String[] args) {

        for (int i = 0; i < args.length; i++) {
            final String value = args[i + 1];

            switch (args[i]) {
                case "-mode":
                    mode = value;
                    break;
                case "-key":
                    key = Integer.parseInt(value);
                    break;
                case "-data":
                    data = value;
                    break;
                default:
                    break;
            }
            i++;
        }

    }

    public void encryptMessage() {
        final String MESSAGE = data;
        final int key = this.key;

        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            newMessage.append((char) (character + key));
        }
        System.out.println(newMessage);
    }

    public void decryptMessage() {
        final String MESSAGE = data;
        final int key = this.key;

        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            newMessage.append((char) (character - key));
        }
        System.out.println(newMessage);
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
}