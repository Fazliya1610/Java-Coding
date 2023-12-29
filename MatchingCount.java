/*  Write a Java program that takes input about items, where each item is represented by type, color, and name.
Given a ruleKey and ruleValue, the program counts and prints the number of items that match the rule. 
The matching criteria are specified based on whether the ruleKey is "type," "color," or "name," and 
if the corresponding value matches the item's type, color, or name, respectively.  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[][] items=new String[n][3];
        for(int i=0;i<n;i++){
          items[i]=sc.nextLine().split(" ");
        }
        String key=sc.nextLine().trim();
        String value=sc.nextLine().trim();
        int count=0;
        for(String[] item:items){
          switch(key){
            case "type":
            if((item[0].trim()).equals(value)){
              count++;
            }
            break;
            case "color":
            if((item[1].trim()).equals(value)){
              count++;
            }
            break;
            case "name":
            if((item[2].trim()).equals(value)){
              count++;
            }
            break;
          }
        }
        System.out.println(count);
    }
}
