import java.util.*;
import java.lang.*;
public class exams{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        ArrayList<pair> alist = new ArrayList<pair>();
        for(int i =0;i<test;i++){
            pair pr = new pair(scan.nextInt(),scan.nextInt());
            alist.add(pr);
        }
        Collections.sort(alist,new Comparator<pair>() {
            @Override
            public int compare(pair a, pair b){
                return a.first - b.first;
            }
        });
        int min = -1;
        for(int i =0;i<test;i++){
            if( min <= alist.get(i).second)
                min = alist.get(i).second;
            else
                min  = alist.get(i).first;
        }
        System.out.println(min);
    }
}
class pair{
    int first;
    int second;
    pair(int a,int b){
        first = a;
        second = b; 
    }
}