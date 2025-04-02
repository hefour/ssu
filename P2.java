import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("생일을 입력하세요>>");
        int birth;
        birth=sc.nextInt();
        int year=birth/10000;
        int month=birth%10000/100;
        int day=birth%100;
        System.out.printf("%d년 %d월 %d일",year,month,day);
        sc.close();
        }
    }