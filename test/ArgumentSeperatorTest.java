import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentSeperatorTest {
    @Test
    public void options_should_be_seperated_from_argument(){
        String[] argumentArray = {"-c", "TODO"};
        ArgumentSeperator argument = new ArgumentSeperator(argumentArray);
        assertEquals("-c",argument.OptionSeperator());
    }
    @Test
    public void options_should_be_seperated_from_argument_another(){
        String[] argumentArray = {"-w", "TODO"};
        ArgumentSeperator argument = new ArgumentSeperator(argumentArray);
        assertEquals("-w",argument.OptionSeperator());
    }
    @Test
    public void File_should_be_seperated_from_argument_another(){
        String[] argumentArray = {"-w", "TODO"};
        ArgumentSeperator argument = new ArgumentSeperator(argumentArray);
        assertEquals("TODO",argument.FileSeperator());
    }
}