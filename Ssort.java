import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Ssort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0,min;  
         for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++){
				 //min = arr[i];
				 if(arr[j] < arr[i]){
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  