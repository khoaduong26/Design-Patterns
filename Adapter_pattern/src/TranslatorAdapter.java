public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;
    public TranslatorAdapter(JapaneseAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void send(String message) {
        System.out.println("Reading Words ...");
        System.out.println(message);
        String vietnameseWords = this.translate(message);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }
    private String translate(String message){
        return "みなさんこんにちは";
    }
}
