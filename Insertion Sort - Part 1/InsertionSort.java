import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort{
    
    

    public static void insertIntoSorted(int[] ar) {
        int s = ar.length;
         int num = ar[s-1];
        int i;
         for(i= s-2;i>=0;i--){
             if(ar[i]<num)break;
             ar[i+1]=ar[i];
             printArray(ar);
         }
         ar[i+1]=num;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}