package main.sorter;

public class QuickSorter implements Sorter {
    public int[] sort(int[] values) {
        // quicksort implementation
        return values;
    }

    public int partition(int[] values, int low, int high) {
        int piv = values[low];
        int i = low;
        int tempo = 0;
        for(int j = low + 1; j <= high; j++){
            if (values[j] <= piv){
                i+=1;
                tempo = values[i];
                values[i]= values[j];
                values[j] = tempo;
            }
        }
        tempo = values[i];
        values[i]= values[low];
        values[low]= tempo;
        return i;
    }
    
}
