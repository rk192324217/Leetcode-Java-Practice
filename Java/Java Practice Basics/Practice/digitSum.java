import java.util.*; 
public class digitSum {
    public static void main(String args[]){
        Scanner obj1=new Scanner(System.in);

        int num=obj1.nextInt();
        int sumOdd=0,sumOddPos=0;
        int temp=num;
        int i=Integer.toString(num).length();
        while(temp!=0){
            if((temp%10)%2!=0){
                sumOdd+=temp%10;
            }
            if(i%2!=0){
                sumOddPos+=temp%10;
            }
            i--;
            temp/=10;
        }
        System.out.println("odd rems:"+sumOdd);
        System.out.println("Odd Position:"+sumOddPos);
    }
}
