import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),ss="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122 && i==0)
                ss+=(char)(((int)s.charAt(i))-32);
            else
                ss+=s.charAt(i);
        }
        System.out.print(ss);
    }
}