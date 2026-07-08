/*Two parallel roads separated by a river are connected from cities A and B to an outer
ring road. Both the roads have high flow of traffic throughout the day. People who
want to travel from city A to city B or vice versa have to pass through the ring road
which is a huge waste of time and money. In order to ease the traffic and also to
make it convenient for commuters to travel from city A to city B and vice versa,
construction of a bridge over the river is planned.
The surveillance team submitted a report stating the bridge should be constructed in
the following manner:
• The ground or soil is stronger at certain points on the road favorable for the construction
of the bridge.
• The strong ground positions are given from the starting point of each road. Say, road of
city A has strong ground at 1,4 meaning there is a strong ground at a distance of 1 unit,
another strong ground point at a distance of 4 units from the starting point of the road of
city A.
Collate the strong ground positions of both the roads.
Sort them in ascending order.
Calculate the middle point or median of the combined strong ground positions.
The bridge should be constructed from road A as per the middle point calculated
Given the number of strong positions on the roads of A and B(N1 and N2
respectively), and the strong ground positions on each road, the task here is calculate
the midpoint of the combined strong positions of both the roads.
NOTE: When the strong positions are combined, the repeated positions on the
different roads are dropped.
Example 1:
• Input:
3 -> Value of N1
3 -> Value of N2
{3,5,2} -> a[], Elements a[0]to a[N1-1], where each input element is separated by new line
{1,2,3} -> b[], Elements b[0]to b[N2-1), where each input element is separated by new line
• Output: 2.50
• Explanation:
From the inputs given above:
Number of strong ground positions on road A:3
Number of strong ground positions on road B:3
The positions of strong ground from the starting point of road A are at a distance of 3,5,2 The
positions of strong ground from the starting point of road B are at a distance of 1,2,3
Combining the strong ground positions of both the roads and sorting them in ascending
order
1,2,3,5
Middle points are 2 and 3
2+3=5
5/2=2.5
So, the middle point from where the bridge should be constructed is 2.5.
Hence, the output is 2.50
Example 2:
• Input:
2 -> Value of N1
3 -> Value of N2
{2,3} -> all, Elements a[O]to a[N1-1), where each input element is separated by new line
{5,6,4} -> b[], Elements b[O]to b[N2-1), where each input element is separated by new line
• Output: 4.00
• Explanation:
From the inputs given above:
Number of strong ground positions on road A: 2
Number of strong ground positions on road B:3
The positions of strong ground from the starting point of road A are at a distance of
2,3 The positions of strong ground from the starting point of road B are at a distance
of 5,6,4 Combining the strong ground positions of both the roads and sorting them in
ascending order:
2,3,4,5,6 > Middle point is 4
So, the middle point from where the bridge should be constructed is 4
Hence, the output is 4. */


import java.util.*;
public class p10q1 {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt(), n2=sc.nextInt();
        HashSet<Integer> s=new HashSet<>();
        int A[]=new int[n1];
        int B[]=new int[n2];
        for(int i=0;i<n1;i++){
            A[i]=sc.nextInt();
            if(!s.contains(A[i])){s.add(A[i]);}
        }
        for(int i=0;i<n2;i++){
            B[i]=sc.nextInt();
            if(!s.contains(B[i])){s.add(B[i]);}
        }
        int fn=s.size();
        int arr[]=new int[fn];
        int i=0;
        for(int x:s){
            arr[i]=x;
            i++;
        }
        Arrays.sort(arr);
        
        double ans = fn%2==0 ? (arr[fn/2]+arr[(fn)/2 - 1])/2 : arr[fn/2];
        System.out.println(ans);

    }   
}
