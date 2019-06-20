import java.util.*;
import java.lang.*;
public class registrationsystem{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        while(test-->0){
            String str = scan.next();
            if(map.getOrDefault(str,0)==0)
            {
                System.out.println("OK");
                map.put(str,1);
            }            
            else{
                int v = map.get(str);
                System.out.println(str+""+v);
                map.put(str,v+1);
            }

        }
    }
}