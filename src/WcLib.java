public class WcLib {
    private String text;
    
    public WcLib(String string){
        this.text = string;
    }
    public int CharacterCount() {
        return text.length();
    }
    public int ByteCount() {
            byte[] bytes = text.getBytes();
        return bytes.length;
    }
    public int LineCount() {
        return text.split("\n").length;
    }
    public int WordCounter() {
        int count = 0;
        if (text.length() == 0) {
            return 0;
        }
        String[] words = text.split("\\s+");
        for (int i = 0; i< words.length ; i++) {
            if(words[i]!="" )
                count++;
        }
        return count;
    }
}
