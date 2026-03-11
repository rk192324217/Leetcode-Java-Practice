public class factorial {
    public static long fact(int num){
        if(num<=1) {return 1;}
        return num*fact(num-1);
    }
    public static void main(String args[]){
        // System.out.print(fact(1000));
        int num=145,sum=0;
        int temp=num;
        while(num!=0){
            sum+=fact(num%10);
            num/=10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }

    }
}
