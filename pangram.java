import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        s.toLowerCase();
        Boolean f=true;
        int frq[]=new int[26];
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-97]++;
        }    
        for(int i=0;i<26;i++){
            if(frq[i]==0){
                System.out.print("NO");
                f=false;
                break;
            }
        }
        if(f)
        System.out.print("YES");
    }
}