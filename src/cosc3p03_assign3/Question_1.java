/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc3p03_assign3;

/**
 *
 * @author pw12nb
 */
public class Question_1 {
    int[] list;
    int[] count;
    int overall_max;
    
   public Question_1(int[] list)
   {
       this.list = list;
       count = new int[list.length];
       overall_max = Integer.MIN_VALUE;
   }
   
   public int getLargestIncreasingPath()
   {
       for(int i = 0; i < list.length; i++){
           int local_max = Integer.MIN_VALUE;
           for(int j = 0; j <= i; j++){
               int val = Integer.MIN_VALUE;
               if(i == j) val = 1;
               else if(list[j] < list[i])
               {
                   val = 1 + count[j];
               }
               if(val > local_max)
                   local_max = val;
           }
           count[i] = local_max;
           System.out.println("Longest increasing path to the value "+list[i]+" is: "+count[i]);
           if(local_max > overall_max) overall_max = local_max;
       }
       return overall_max;
   }
    
    
}
