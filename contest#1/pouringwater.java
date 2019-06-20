import java.util.*;

import java.lang.*;
public class pouringwater{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long test = scan.nextLong();
        while(test-->0){
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();

             if(c > a&& c>b){
                 System.out.println("-1");
             }
             else if(c == 0)
                System.out.println("0");
            else if(c%gcd(a,b)!=0)
                System.out.println("-1");
            else
             {
                 System.out.println(Math.min(count(a,b,c),count(b,a,c)));
             }
        }
    }
    public static long gcd(long a,long b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    public static long count(long A,long B,long C){
        long move = 1, a = A, b = 0, pour;
        while(a != C && b != C) 
       {
        pour = Math.min(a, B-b);
        b += pour;
        a -= pour;
        move++;
       
        if(a == C || b == C) 
            break;
    
        if(b==B){
            b = 0;
            move++;
        }
        else if(a==0){
             a = A;
            move++;
        }
       }
        return move;
    }
}