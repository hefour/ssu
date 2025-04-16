import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        System.out.print("양의 정수 10개 입력>>");
        Scanner sc=new Scanner(System.in);
        int[] n=new int[10];
        int k=1;
        int j=0;
        int[] fres =new int[10];
        for(int i=0;i<n.length;i++){
            int res=0;
            n[i]=sc.nextInt();
            k=n[i];
            while (k>0){
                res+=k%10;
                k=k/10;
            }
            if(res==9){
                fres[j]=n[i];
                j++;
            }
        }
        System.out.print("자리수의 합이 9인 것은 ...");
        for(int i=0;i<fres.length;i++){
            if(fres[i]!=0){
                System.out.print(fres[i]+" ");
            }
        }
    }
}


