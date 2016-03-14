/**
 * Created by deepdoradla on 14/03/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        int A[] = new int[10];
        //Fill elements in to the array
        fillArray(A);
        //Print elements before sort
        System.out.println("Printing unsorted array :");
        printArray(A);

        MergeSort m = new MergeSort();
        A = m.mergeSort(A);

        //Print sorted array
        System.out.println("Printing sorted array :");
        printArray(A);
    }


    public static int[] fillArray(int[] A)
    {
        for(int i=0; i<A.length; i++)
        {
            A[i] = (int) (Math.random()*100);
        }

        return A;
    }

    public static void printArray(int[] A)
    {
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + ", ");
        }
    }
}
