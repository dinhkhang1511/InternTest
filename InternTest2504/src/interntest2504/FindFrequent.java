/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interntest2504;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class FindFrequent {
    static ArrayList<Object> arr = new ArrayList<>();
    static ArrayList<Object> sortedArr = new ArrayList<>();

    public static void main(String[] args) {
        //UNCOMMENT TEST CASE MUỐN TEST và COMMENT CÁC TEST CASE CÒN LẠI
//        TEST CASE 1
//        arr.add(3);
//        arr.add(7);
//        arr.add(3);

        
//        TEST CASE 2
        arr.add(null);
        arr.add("hello");
        arr.add(true);
        arr.add(null);
        
//        TEST CASE 3
//        arr.add(false);
//        arr.add("up");
//        arr.add("down");
//        arr.add( "left");
//        arr.add("right");
//        arr.add(true);
//        arr.add(false);
        
        

        for(Object obj : arr)
        {
            if(!sortedArr.contains(obj))
                sortedArr.add(obj);
        }
        System.out.println(findFrequent());
        
       
    }
    
    public static Object findFrequent()
    {
        int count = 0,temp = 0;
        
        Object popular = null;
        for(Object index : sortedArr)
       {
           count = 0;         
           for(Object obj : arr)
           {
               if(index==obj)
               {
                   count++;
                   if(count>temp)
                   {
                        popular = index;
                        temp = count;
                   }
               }
               
           }
       }
        return popular;
    }
    
}
