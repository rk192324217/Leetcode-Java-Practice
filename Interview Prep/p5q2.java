import java.util.*;
public class p5q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        } 
        int l=0,r=0,maxlen=0,temp=0;
        while(l<n && r<n){
             temp+=prices[r++];
            while(temp>=k ){
                temp-=prices[l++];
            }
            maxlen=maxlen>(r-l)?maxlen:(r-l);
        }
        System.out.println(maxlen);
    }
}
