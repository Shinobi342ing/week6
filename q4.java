import java.util.Scanner;

/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
         int[] a={10,20,30,40,50};
         float sum=0f;
         float highest=a[0];
         float lowest=a[0];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            sum+=a[i];
            if(highest<a[i]){
                highest=a[i];
            }
            if(lowest>a[i]){
                lowest=a[i];
            }
        }
        float avg=sum/a.length;
        System.out.println("Sum="+sum+"Highest="+highest+"Lowest="+lowest);
        System.out.println("enter numbre of subjects");
        int n=input.nextInt();
        int[] array;
        array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" subjects marks");
            array[i]=input.nextInt();
        }
        System.out.println("new array");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}