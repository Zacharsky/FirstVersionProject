import java.util.ArrayList;

public class SortB implements SortInterface {

    @Override
    public void Sort(ArrayList<Integer> numberList) {
        int size = numberList.size();
        int sortedSize=0;
        for(int i=1; i<=size-1; i++) {
            int j=i;
            do{
                if(numberList.get(j)<numberList.get(j-1)) {
                    int small=numberList.get(j);
                    int large=numberList.get(j-1);
                    numberList.set(j-1, small);
                    numberList.set(j, large);
                }
                j--;
            }while(j>sortedSize);
        }
    }
}
