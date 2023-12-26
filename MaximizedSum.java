/*A basket array containing 2n fruits. She needs to pair these fruits 
into n pairs (a1,b1) ,( a2,b2).....,(an,bn) such that the sum of the min(ai,bi) 
for all i is maximized.Print the maximized sum.*/

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
          arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int sum=0;
        for(int i=0;i<n;i+=2){
          sum+=arr.get(i);
        }
        System.out.println(sum);
    }
}
