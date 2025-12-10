import java.util.Scanner;

/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T
{   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        //int[][] b;
        int[][]b= {{1,2,3},{4,5},{9,3},{0},{1,2,3,4}};
        //b= new int[4] [3];
           for(int i=0;i<b.length;i++){
               for(int j=0;j<b[i].length;j++){
                   System.out.print(b[i][j]+" ");
               }
                 System.out.println();
           }
         
           
        int[] before={1,2,3,4,5};
        int n=0;
        int[] after=new int[before.length];
        for(int i=before.length-1;i>=0;i--){
            after[n]=before[i]; //storing
            n++;
        }
        for(int i=0;i<after.length;i++){
            System.out.println(after[i]);
        }
        /**int []a={1,2,3};
        int []newar;
        //a[2]=in.nextInt();
        //newar=new int[a.length];
        
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            newar[j]=a[i];
            j++;
        }

        
        for(int i=0;i<newar.length;i++){
            System.out.print(newar[i]);
        }
        **/
    }
}   