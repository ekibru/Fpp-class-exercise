package In_Class_Demo;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.testng.Assert.assertEquals;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        double [] r = new double[5];
//        for (int i = 0; i < r.length; i++) {
//            r[i] = Math.random()*100;
//        }
//
//        System.out.print(Arrays.toString(r) +" ");

        //reverse();

//        int [] arr ={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
//        System.out.print("Min is: "+ min(arr));
        String [] island = new String[4];
        island[0]="bermuda";
        island[1]="fiji";
        island[2]="aorua";
        island[3]="colombia";

       int [] index = new int[4];
       index[0]=1;
       index[1]=3;
       index[2]=0;
       index[3]=2;

       int y=0;
       int ref;
       while (y<4){
           ref = index[y];
           System.out.print("island is ");
           System.out.println(island[ref]);
           y=y+1;
       }



    }
 public static  int max(int [] arr){
        int max= arr[0];

     for (int i = 1; i < arr.length; i++) {
         if(max<arr[i])
             max=arr[i];
     }
     return max;
 }
 public static int counVowel(String input){

     System.out.println("Enter a sentence: ");
     String str = scanner.nextLine();
        int count =0;
     for (int i = 0; i < input.length(); i++) {
         if(input.charAt(i)=='a'||input.charAt(i)=='e'||
             input.charAt(i)=='i'||input.charAt(i)=='o'||
                 input.charAt(i)=='u')
             count++;
     }
     return count;
 }
 public static  int sum(int [] arr){
     int total=0;
     for (int i = 0; i < arr.length ;i++) {
         total+=arr[i];
     }


     return total;
 }
 public static void reverse(){
    System.out.print("Enter a word: ");
    String input = scanner.nextLine();

    for (int i = input.length()-1; i >=0 ; i--) {
        System.out.print(input.charAt(i)+" ");
    }
}
 public static int min(int [] arr){
        int min=arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(min>arr[i])
            min=arr[i];
    }
        return min;
}

}
