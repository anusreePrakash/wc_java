import java.io.*;

class WcFileReader{
    public static void main(String args[]) throws IOException, FileNotFoundException{
        String fileName = args[1];
        File file = new File(fileName);
        System.out.println(fileName);
        int size = (int)file.length();
        char[] buffer = new char[size];
        FileReader fr = new FileReader(file);
        fr.read(buffer,0,size);
        fr.close();
    }
}
