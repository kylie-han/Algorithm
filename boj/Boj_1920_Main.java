import java.util.Scanner;
import java.util.Arrays;

public class Boj_1920_Main {
    static int [] A ;
    
    public static int bs(int start, int end, int input)
    {
        int mid = (start + end )/2;
        
        if (mid >= end)
            return 0;
            
        if(A[mid] == input)
        {
            return 1;
        }else if (A[mid] < input)
        {
            return bs(mid+1, end, input);
        }else {
            return bs(start, mid, input);
        }
    }
    
     public static void main(String []args){
         
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        A = new int [input];
        for (int i = 0 ; i < input ; i++)
        {
            A[i] = sc.nextInt();
        }
        
        int input2 = sc.nextInt();
        int check ;
        
        Arrays.sort(A);
        
        for (int i = 0 ; i < input2 ; i++)
        {
            check = sc.nextInt();
            System.out.println(bs(0,A.length, check));
        }
        sc.close();
     }
}