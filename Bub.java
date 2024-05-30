import java.lang.*;
import java.util.Scanner;
public class Bub {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of strings");
        int n=s.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a string"+(i+1)+":");
            arr[i]=s.next();

        }
        System.out.println("original strings are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(String sc:arr){
            System.out.println("\n"+sc+" ");
        }
        System.out.println();
    }

    
}
