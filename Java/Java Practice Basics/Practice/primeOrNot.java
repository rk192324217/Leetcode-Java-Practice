import java.util.Scanner;

public class primeOrNot {
        public static void main(String args[]){
        Scanner obj1=new Scanner(System.in);

        int num=obj1.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime);
        obj1.close();
    }
}
