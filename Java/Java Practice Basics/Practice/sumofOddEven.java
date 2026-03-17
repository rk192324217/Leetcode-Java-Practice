public class sumofOddEven {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int evenSum=0,oddSum=0;
        for(int i:arr){
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        System.out.printf("Even Sum: %d \nOdd Sum:%d",evenSum,oddSum);
    }
}
