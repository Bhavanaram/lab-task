import java.util.*; 
class Remduplicate {
    public static void removeDuplicates(int[] a)
    {
 LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
  for (int i = 0; i < a.length; i++)
set.add(a[i]);
System.out.print(set);
    }
    public static void main(String[] args)
    {
        int a[] = {5,3,4,5,2,1,6};
        removeDuplicates(a);
    }
}