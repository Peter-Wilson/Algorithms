/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc3p03_assign3;

import java.util.Scanner;

/**
 *
 * @author pw12nb
 */
public class COSC3P03_Assign3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize the scanner
        Scanner sc = new Scanner(System.in);
        
        // select the program to use
        System.out.println("Select the question you with to run (1, 2 or 3):");
        int question = sc.nextInt();
        if(question == 1)
        {
            System.out.println("Enter the length of the list:");
            int n = sc.nextInt();
            int[] list = new int[n];
            
            System.out.println("Enter n-values into the list separated by spaces");
            for(int i = 0; i <= n && sc.hasNext(); i++)
                list[i] = sc.nextInt();
            
            Question_1 q2 = new Question_1(list);
            System.out.println("Longest Path is: "+ q2.getLargestIncreasingPath());           
        }
        if(question == 2)
        {
            System.out.println("Enter the number of matrices:");
            int n = sc.nextInt();
            int[] matrices = new int[n+1];
            
            System.out.println("Enter n-values into the list separated by spaces");
            for(int i = 0; i <= n && sc.hasNext(); i++)
                matrices[i] = sc.nextInt();
            
            Question_2 q2 = new Question_2(n, matrices);
            q2.printBrackets();            
        }
        else
        {
            System.out.println("Enter the distance you wish to travel: ");
            int n = sc.nextInt();
            Question_3 q3 = new Question_3(5);
            q3.getCheapestPath(n);
        }
    }
    
}
