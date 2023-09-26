import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length(),c=0;
        if(s.contains("1111111") || s.contains("0000000"))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}