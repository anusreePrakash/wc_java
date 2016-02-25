public class ArgumentSeperator {
    private String[] argument;

    public ArgumentSeperator(String[] arguments){
        this.argument  = arguments;
    }
    public String OptionSeperator(){
        return this.argument[0];
    }
    public String FileSeperator(){
        return this.argument[1];
    }
}