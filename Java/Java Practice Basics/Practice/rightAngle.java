public class rightAngle {
    public static void main(String args[]){
        // int row=6;
        // for(int i =1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" RK   ");
        //     }
        //     System.out.println();
        // }

        int a=10,b=5,res=a++ + ++a * --b - b--;
        System.out.printf(" A:%d B:%d Res:%d",a,b,res);
    }
}
