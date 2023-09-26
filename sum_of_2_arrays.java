import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt(),dig=0;
        long num1=0,num2=0,sum=0,anss=0;
        
        for(int i=0;i<size1;i++){
            num1=(num1*10)+sc.nextLong();     
        }
        
        int size2=sc.nextInt();
        for(int i=0;i<size2;i++){
            num2=(num2*10)+sc.nextLong();
        }
        sum=num1+num2;
        anss=sum;
        while(sum>0){
            sum/=10;
            dig+=1;
        }
        long ans[]=new long[dig];
        for(int i=dig-1;i>=0;i--){
            ans[i]=(anss%10);
            anss/=10;
        }
        for(int i=0;i<dig;i++){
            System.out.print(ans[i]+" ");
        }
}
}