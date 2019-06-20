import java.util.*;
import java.lang.*;
public class letters{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int letters = scan.nextInt();
        long []arrnum = new long [num];
        for(int i =0;i<num;i++){
            arrnum[i] = scan.nextLong();
        }
        long []arrlet = new long[letters];
        long []temp = new long[num];
        temp[0] = arrnum[0];
        for(int i =1;i<num;i++){
            temp[i] = temp[i-1]+arrnum[i];
        }
        long totalroom = 0;
        for(int i =0;i<letters;i++){
            arrlet[i] = scan.nextLong();
            totalroom += arrlet[i];
        }
        for(int i =0;i<letters;i++){
            int high = num-1;
            int low = 0;
            while( low < high){
                int mid = low + (high - low)/2;
                if(arrlet[i] <= temp[mid]){
                    high = mid;
                }
                else 
                {
                    low = mid +1;
                }
            }
            if( low == 0){
                System.out.println(low+1+" "+arrlet[i]);
            }
            else{
                long res = arrlet[i]-temp[low-1];
                System.out.println(low+1+" "+res);
            }
        }
    }
}