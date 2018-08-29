import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static boolean b;
    static boolean in;
    public static void readNumbers(){
        try {
            String line = null;
            FileReader fileReader = new FileReader(Data.path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("B") ) {
                    b = true;
                }else if (line.contains("IN")) {
                    in = true;
                }
                else {
                    Data.numberList.add(Integer.parseInt(line));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
