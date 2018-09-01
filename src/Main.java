import javax.xml.soap.Text;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ReadFile.readNumbers();
        System.out.println("Before sort:");
        System.out.println(Data.numberList);
        SortTool t1 = new SortTool(Data.numberList);
        if(ReadFile.b) {
            t1.setSortStrategy(new SortA());
            t1.sortArray();
            System.out.println("After bubble sort :");
            System.out.println(Data.numberList);
        }else if(ReadFile.in) {
            t1.setSortStrategy(new SortB());
            t1.sortArray();
            System.out.println("After insertion sort:");
            System.out.println(Data.numberList);
        }
    }
}
