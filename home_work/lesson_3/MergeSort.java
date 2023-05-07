package Java_project.home_work.lesson_3;

//Реализовать алгоритм сортировки слиянием

public class MergeSort {
  public static void main(String args[]) {
    int array[] = {12,11,13,5,6,7};

    System.out.println("Заданный массив");
    printArray(array);

    MergeSort ob = new MergeSort();
    ob.sort(array,0,array.length-1);

    System.out.println("Сортированный масив");
    printArray(array);
    
}

void merge(int array[], int left, int middle, int right ) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    int leftArr[] = new int[n1];
    int rightArr[] = new int[n2];

    for (int i = 0; i < n1; ++i) {
        leftArr[i] = array[left + i];
    }
    for (int j = 0; j < n2; ++j) {
        rightArr[j] = array[middle + 1 + j];
    }

    int i = 0, j = 0;

    int k = left;
    while (i < n1 && j < n2) 
    {
        if (leftArr[i] <= rightArr[j]) 
        {
            array[k] = leftArr[i];
            i++;
        } else 
        {
            array[k] = rightArr[j];
            j++;
        }
        k++;
    }
    while (i < n1) 
    {
        array[k] = leftArr[i];
        i++;
        k++;
    }
    while (j < n2) 
    {
        array[k] = rightArr[j];
        j++;
        k++;
    }
}
void sort(int array[], int left, int right){
    if (left < right)
    {
            int middle = (left + right) / 2;

            sort(array, left, middle);
            sort(array, middle + 1, right);

            merge(array, left, middle, right);
    }
}

        



static void printArray(int array[]){
    int n = array.length;
    for (int i = 0; i < n; ++i) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}
}
