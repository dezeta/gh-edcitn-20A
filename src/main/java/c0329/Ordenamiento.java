package c0329;

/*
 
 TODO: Por simplicidad ordenamos solo integers, como ejercicio queda que proponga generalizar esto 

 El autor del mergesort y quicksort base transcripto en este ejemplo es 
 Lars Vogel (http://www.vogella.com)

 */
public class Ordenamiento {

    private int[] numbers;
    private int[] helper;
    private int number;

    public void bubbleSort(int[] vector) {
        int i, j, t = 0;
        int n = vector.length;
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (vector[j - 1] > vector[j]) {
                    t = vector[j - 1];
                    vector[j - 1] = vector[j];
                    vector[j] = t;
                }
            }
        }
    }

    public void insertionSort(int[] vector) {
        int i, j, indice;

        for (i = 1; i < vector.length; i++) {
            indice = vector[i];

            for (j = i - 1; j >= 0 && vector[j] > indice; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = indice;

        }
    }

    public void mergeSort(int[] vector) {
        this.numbers = vector;
        number = vector.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // Check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = (low + high) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }

    public void quickSort(int[] vector) {
        // Check for empty or null array
        if (vector == null || vector.length == 0) {
            return;
        }
        this.numbers = vector;
        number = vector.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        //Toma el pivot directamente de la mitad de la lista
        //TODO: Como ejercicio propuesto, queda que adapte el codigo para que use la mediana de tres
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
