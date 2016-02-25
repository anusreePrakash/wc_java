import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentSeperatorTest {
    @Test
    public void options_should_be_seperated_from_argument(){
        String[] argumentArray = {"-c", "TODO"};
        ArgumentSeperator argument = new ArgumentSeperator(argumentArray);
        String[] option = argument.optionSeperator();
        assertEquals("-c",option[0]);
    }
    @Test
    public void options_should_be_seperated_from_argument_another(){
        String[] argumentArray = {"-w", "TODO"};
        ArgumentSeperator argument = new ArgumentSeperator(argumentArray);
        String[] option = argument.optionSeperator();
        assertEquals("-w",option[0]);
    }
    @Test
    public void File_should_be_seperated_from_argument_another(){
        String[] argumentArray = {"-w", "TODO"};
        ArgumentSeperator argument = new ArgumentSeperator(argumentArray);
        String[] result = argument.fileSeperator();
        assertEquals("TODO",result[0]);
    }

}