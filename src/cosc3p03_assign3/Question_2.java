/*
 * Implement the algorithm matrix chain multiplication to find an optimal way to
   multiply n matrices.
 */
package cosc3p03_assign3;

/**
 *
 * @author pw12nb
 */
public class Question_2 {
   int[][] multi;
   int n;
   int[][] ks;
   int[] matrices;
   
   public Question_2(int[] matrices)
   {
       this.n = matrices.length-1;
       multi = new int[n][n];
       this.matrices = matrices;
   }
   
   public void printBrackets()
   {
       getLowestMultiplications();
       String output = printOptimumPath(0,n-1);   
       System.out.println(output);
   }
   
   public int getLowestMultiplications()
   {
       ks = new int[n][n];
       for(int i = 0; i < n; i++)
       {
           for(int j = 0; i+j<n; j++)
           {
               //if the indeces are the same
               if((i+j)==j) 
               {
                    multi[j][i+j] = 0;
                    System.out.println("the k for ["+j+","+(i+j)+"]: 0");
                    continue;
               }
               
               int min = Integer.MAX_VALUE;
               int k = 0;
               
               for(int l = j; l < i+j; l++)
               {
                   int val = (multi[j][l] + multi[l+1][i+j] + matrices[j]*matrices[l+1]*matrices[i+j+1]);
                   
                   if(val < min){
                       min = val;
                       k=l;
                   }
                   multi[j][i+j] = min; 
                   System.out.println("the min for ["+j+","+(l)+"]["+(l+1)+","+(i+j)+"]: "+min);                  
               }
               ks[j][i+j] = k;
               System.out.println("the k for ["+j+","+(i+j)+"]: "+k);
           }
       }
       return multi[0][n-1];
   }

    private String printOptimumPath(int i, int j) {
        if(ks == null) return "optimum path not yet calculated, ";
        if(i == j)
        {
            return "("+i+")";
        }
        else if(j-i == 1){
            return "("+i+" x "+j+")";
        }
        else
        {
            return "("+printOptimumPath(i,ks[i][j]) + printOptimumPath(ks[i][j]+1,j)+")";
        }
    }
   
}
