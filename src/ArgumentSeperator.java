public class ArgumentSeperator {
    private String[] argument;
    private String option;

    public ArgumentSeperator(String[] arguments) {
        this.argument = arguments;
    }

    // public String[] optionSeperator() {
    //     String[] optionsUsed = new String[this.argument.length];
    //     int index = 0;
        for(int i = 0; i < this.argument.length; i++) {
            if (isOption(this.argument[i]))
                optionsUsed[index++] = this.argument[i];
        }
        return optionsUsed;
    }

    public String[] fileSeperator() {
        String[] files = new String[this.argument.length];
        int index = 0;
        for(int i = 0; i < this.argument.length; i++) {
            if (!isOption(this.argument[i]))
                files[index++] = this.argument[i];
        }
        return files;
    }

    public boolean isOption(String option) {
        String[] options = new String[]{"-c", "-w", "-m", "-l"};
        for (String opt : options) {
            if (opt == option) {
                return true;
            }
        }
        return false;
    }
}
