import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar) {       
        int len = ar.length;
        int[] array = ar;
        for (int i=1; i<len; i++){
            insertionSortPart1(ar, 0, i);
            printArray(ar);
        }
    }  
    
    public static void insertionSortPart1(int[] ar, int from, int to) {
        int index = -1;
        for (int i = from; i < to; i++){
            if (ar[i]>ar[to]){
                index = i;
                break;
            }
        }
        if (index>=0){
            int temp = ar[to];
            for (int i = to; i>index; i--){
               ar[i] = ar[i-1];
            }
            ar[index] = temp;
        }
        
    }
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}