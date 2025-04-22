import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,count=0,num;
        String n="0";
        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");
        while(true){
            try {
                n=sc.next();
                if(n.equals("-1")){
                    break;
                }
                num=Integer.parseInt(n);
                if(num>0){
                    count++;
                }else{
                    System.out.println(n+" 제외");
                    num=0;
                }

            }catch(NumberFormatException e){
                System.out.println(n+" 제외");
                num=0;
            }
            sum=sum+num;
        }
        System.out.printf("평균은 %d\n",sum/count);
        sc.close();
    }
}
