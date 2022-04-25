/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interntest2504;

import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author PC
 */

public class Findmax5 {
   static int[] max5={}; 
   static int[] arr ={};

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       // TODO code application logic here
//       NHẬP CÁC SỐ TƯƠNG ỨNG CHO 1 PHẦN TỬ CỦA MẢNG, NHẬP 0 ĐỂ DỪNG CHƯƠNG TRÌNH NHẬP VÀ TÌM 5 SỐ LỚN NHẤT
       while(true)
       {
          Scanner sc = new Scanner(System.in);
          int i = sc.nextInt(); 
          if(i==0)
              break;
          arr = addX(arr.length, arr, i);
       }
       
       
       findmax5(arr);     
        System.out.println(Arrays.toString(max5));
    }
    
   
    public static int[] addX(int n, int arr[], int x)
    {
        int i;
  
        // create a new array of size n+1
        int newarr[] = new int[n + 1];
  
        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
  
        newarr[n] = x;
  
        return newarr;
    }
    
    public static int findmax5(int[] a)
    {
        int max = 0,pos=0;
        
        for (int i=0;i<a.length;i++)
        {
            if(max<=a[i])
            {
                max=a[i];
                pos = i;
            }
        }
        arr[pos]=0;
        max5 = addX(max5.length, max5, max);
       if(max5.length<5)
           return findmax5(arr);
        return 0;

    }
}
            
    