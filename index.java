import java.util.Arrays;
public class index {
    public static int findIndex(int arr[], int t)
    {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
    public static void main(String[] args)
    {
        int[] my_array = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Index position of 6 is: " + findIndex(my_array, 6));
        System.out.println("Index position of 3 is: " + findIndex(my_array, 3));
    }
}