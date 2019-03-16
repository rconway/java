import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        // UTF-16BE (Java string internal encoding)
        String thumbs = "\uD83D\uDC4D";
        System.out.println("Hello World! = " + thumbs);

        // UTF-8
        byte[] thumbs2 = { (byte)0xF0, (byte)0x9F, (byte)0x91, (byte)0x8D };
        String thumbs2str = new String(thumbs2, StandardCharsets.UTF_8);
        System.out.println("Thumbs up = " + thumbs2str);
    }
}
