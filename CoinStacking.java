/* You are given n coins, and you want to construct a staircase with rows having an increasing number of coins. 
The last row can be incomplete. Write a function that returns the number of full rows of the staircase you can create with the given coins. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1,c=1;
        while(c<=n){
          r++;
          c+=r;
        }
        System.out.println(r-1);
    }
}
