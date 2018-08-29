import java.util.ArrayList;

public class SortA implements SortInterface {

    @Override
    public void Sort(ArrayList<Integer> numberList) {
        int size = numberList.size();
        int temp1;
        int temp2;
        do {
            for (int i = 0; i < size-1; i++) {
                if (numberList.get(i) > numberList.get(i + 1)) {
                    temp1= numberList.get(i + 1);
                    temp2= numberList.get(i);
                    numberList.set(i,temp1);
                    numberList.set(i+1,temp2);
                }
            }
            size = size - 1;
        } while (size != 1);
    }
}
