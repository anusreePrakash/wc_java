import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class WcTest{
	@Test
	public void should_give_the_count_of_characters_m(){
        String text = new String("wc is a tool to count \n the number of characters in a file.\n mmmm 豆贝尔维");
		WcLib wc = new WcLib(text);
		assertEquals(70,wc.CharacterCount());
	}
    @Test
    public void should_give_the_count_of_characters_m_for_empty_string(){
        String text = new String("");
        WcLib wc = new WcLib(text);
        assertEquals(0,wc.CharacterCount());
    }
    @Test
    public void should_give_the_count_of_characters_m_for_space_string(){
        String text = new String("   ");
        WcLib wc = new WcLib(text);
        assertEquals(3,wc.CharacterCount());
    }
    @Test
	public void should_give_the_count_of_characters(){
        String text = new String("wc is a tool to count \n the number of characters in a file.\nmmmm 豆贝尔维");
		WcLib wc = new WcLib(text);
		assertEquals(77,wc.ByteCount());
	}
    @Test
	public void should_give_the_count_of_characters_another_test(){
        String text = new String("uihufgyuful\nuogiyfuyl\n汉语/漢語; Hànyǔ or 中文; Zhōngwén");
		WcLib wc = new WcLib(text);
		assertEquals(66,wc.ByteCount());
	}
    @Test
	public void should_give_the_count_of_characters_another_second_test(){
        String text = new String("汉语/漢語");
		WcLib wc = new WcLib(text);
		assertEquals(13,wc.ByteCount());
	}
    @Test
    public void should_give_the_count_of_lines(){
        String text = new String("wc is a tool to count \n the number of characters in a file.\nmmmm 豆贝尔维");
        WcLib wc = new WcLib(text);
        assertEquals(3,wc.LineCount());
    }
    @Test
    public void should_give_the_count_of_words(){
        String text = new String("wc is a tool to count \n the number of characters in a file.\nmmmm 豆贝尔维");
        WcLib wc = new WcLib(text);
        assertEquals(15,wc.WordCounter());
    }
    @Test
    public void should_give_the_count_of_words_for_null_string(){
        String text = new String("");
        WcLib wc = new WcLib(text);
        assertEquals(0,wc.WordCounter());
    }
}
