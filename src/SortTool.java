import java.util.ArrayList;

public class SortTool {

    SortInterface sortingStrategy;

    SortTool(ArrayList<Integer> numberList) {

    }
    public void setSortStrategy(SortInterface strategy) {
        sortingStrategy = strategy;
    }
    public void sortArray() {
        sortingStrategy.Sort(Data.numberList);
    }
}
