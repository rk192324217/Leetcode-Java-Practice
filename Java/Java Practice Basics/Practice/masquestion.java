// i1=148 i2=3 output=3;
public class masquestion{
    public static void main(String args[]){
        int i1=148;
        int i2=3;
        int n=i1*i2;
        int r=0;
        while(n>9){
            r=0;
            while(n>0){
                r+=n%10;
                n/=10;
            }
            n=r;
        }
        System.out.println(n);
        
    }
}