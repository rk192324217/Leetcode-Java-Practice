import java.util.*;
public class multiplicationTable {
    public static void main(String args[]){
        System.out.println("Enter the number to find the multiplication:");
        Scanner obj1=new Scanner(System.in);
        int num=obj1.nextInt();

        for(int i =10;i<=20;i++){
            System.out.printf("%d X %d = %d \n",i,num,i*num); //here inorder to format the string I am using printf
        }

    }
}
