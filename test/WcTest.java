import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class WcTest{
	@Test
	public void should_give_the_count_of_characters(){
		WordCount wc = new WordCount();
        String text = new String("wc is a tool to count \n the number of characters in a file.");
		assertEquals(59,wc.CharacterCount(text));
	}
    // @Test
    // public void should_give_the_count_of_lines(){
    //     WordCount wc = new WordCount();
    //     String text = new String("wc is\n a tool to count \n the number of characters in a file.");
    //     assertEquals(60,wc.LineCount(text));
    // }

}
