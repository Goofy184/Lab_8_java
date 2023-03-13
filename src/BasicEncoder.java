public class BasicEncoder {
    private final String key;
    public BasicEncoder(String keyWord) {
        this.key = keyWord;
    }
    public String encode(String textToEncode) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < textToEncode.length(); i++) {
            encodedText.append((char)(textToEncode.charAt(i) ^ key.charAt(i % key.length())));
        }
        return encodedText.toString();
    }
    public String decode(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            decodedText.append((char)(encodedText.charAt(i) ^ key.charAt(i % key.length())));
        }
        return decodedText.toString();
    }
}