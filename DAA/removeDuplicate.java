import java.util.*;
public class removeDuplicate {
    public static void main(String args[]){
        HashSet<Integer> s=new HashSet<>();
        
        int arr[]=new int[]{1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,21,21,225,22624,9,9,10,10};
        int n=arr.length;
        for(int i =0 ;i<n;i++){
            if(!s.contains(arr[i]))s.add(arr[i]);
        }
        int j=0;
        int res[]=new int[s.size()];
        for(int num:s){
            res[j++]=num;
        }
        for(int i : res){System.out.println(i);}
        
    }
    
}
