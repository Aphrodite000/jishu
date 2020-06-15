import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
        int n=sc.nextInt();
        int m=jiechen(n);  //m项
        //System.out.println(m);
        int p=0;
        for(int i=0;i<m;i++){
            p=2*i+1;
        }
        while(n>0){
            p=p+2;
            if(n==1){
                System.out.println(p);
            }else{
                System.out.print(p);
            }

            if(n!=1){
                System.out.print("+");
            }
            n--;
        }
        }
    }
    public static int jiechen(int n){
        // 从1加到n-1
        int sum=0;
        for(int i=1;i<n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
