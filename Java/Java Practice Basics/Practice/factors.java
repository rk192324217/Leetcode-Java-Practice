import java.util.*;
public class factors {
    public static void main(String args[]){
        Scanner obj1=new Scanner(System.in);

        int num=obj1.nextInt();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.printf("%d X %d\n",i,num/i);
            }
        }
        obj1.close();
    }
}