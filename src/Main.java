public class Main {
    public static void main(String[] args) {
        String text = "Мова Java знайшла широке застосування для програмування браузерів у мережі Інтернет. " +
                "На ній можна створювати повноцінні програмні продукти - застосунки (applications), а також аплети (applets), що виконуються у мережі Інтернет.";
        BasicEncoder basicEncoder = new BasicEncoder("Spas Oleh Ihorovych");
        String encodedText = basicEncoder.encode(text);
        System.out.println("Text: ");
        System.out.println(text);
        System.out.println("Encoded: ");
        System.out.println(encodedText);
        System.out.println("Decoded: ");
        System.out.println(basicEncoder.decode(encodedText));
    }
}