public class WordCount {
    private int count = 0;
    public int CharacterCount(String string) {
        return string.length();
    }
    public int LineCount(String string) {
        return string.split("\n").length;
    }
    public int WordCounter(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i< words.length ; i++) {
            if(words[i]!="\n" || words[i]!="\t" || words[i]!="\r" )
                count++;
        }
        return count;
    }
}
