import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       long nums[]=new long[t];
       for(int i=0;i<t;i++){
           nums[i]=sc.nextLong();
       }
       for(int i=0;i<t;i++){
           int c=0;
            while(nums[i]>0){
            if(nums[i]%10==4)
                c+=1;
            nums[i]/=10;
        }
           System.out.println(c);
       }
    }
}