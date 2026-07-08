import java.util.*;
public class p7q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int scores[]=new int[n];
        int revindx[]=new int [k];
        int revscore[]=new int [k];
        for(int i =0 ; i<n;i++){
            scores[i]=sc.nextInt();
        }
        for(int j=0;j<k;j++){
            revindx[j]=sc.nextInt();
        }
        for(int j=0;j<k;j++){
            revscore[j]=sc.nextInt();
        }
        for(int j=0;j<k;j++){
            scores[revindx[j]]=revscore[j];
        }
        int res=n;
        for(int m=1;m<n;m++){
            if(scores[m]==scores[m-1])res--;
        }
        System.out.print(res);
    }
}
