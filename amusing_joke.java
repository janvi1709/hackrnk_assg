import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String guest=sc.next();
        String residence=sc.next();
        String pile=sc.next();
        guest+=residence;
        char a1[]=guest.toCharArray();
        char a2[]=guest.toCharArray();
        int flag=1;
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(guest.length()==pile.length()){
            for(int i=0;i<pile.length();i++){
                if(a1[i]!=a2[i]){
                    flag=0;
                    break;
                }
            }
        }
        else
            flag=0;
        if(flag==1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}