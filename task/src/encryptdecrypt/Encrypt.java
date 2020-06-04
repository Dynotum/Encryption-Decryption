package encryptdecrypt;

public class Encrypt {
    private final int aLowerCase = 97;  // a -> 97
    private final int zLowerCase = 122; // z -> 122  ASCII

    public void encryptMessage() {
        final String MESSAGE = "we found a treasure!";
        final StringBuilder newMessage = new StringBuilder();

        for (char character : MESSAGE.toCharArray()) {
            final int currentASCII = character;
            if (currentASCII >= aLowerCase && currentASCII <= zLowerCase) {
                // MAX - character + MIN
                newMessage.append((char) (zLowerCase - currentASCII + aLowerCase));
            } else {
                newMessage.append((char) currentASCII);
            }
        }
        System.out.println(newMessage);
    }
}
