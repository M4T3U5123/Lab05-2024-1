package main.sorter;

public class MergeSort implements Sorter {
 @Override
    public int[] sort(int[] values) {
        if (values.length <= 1) return values;

        int middle = values.length/2;
        int leftArray[] = new int[middle];
        int rightArray[] = new int[values.length - middle];

        int i = 0;
        int j = 0;

        for(; i < values.length; i++){
            if (i < middle){
                leftArray[i] = values[i];
            } else {
                rightArray[j] = values[i];
                j++;
            }
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, values);

        return values;
    }

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < left.length) {
            result[k++] = right[j++];
        }
        return result;
    }

}
