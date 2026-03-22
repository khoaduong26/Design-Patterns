
public class VietnameseClient {
    public static void main(String[] args) throws Exception {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào mọi người");
    }
}
 