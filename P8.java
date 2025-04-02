import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산 입력>>");
        int isGood=0;
        double a = sc.nextDouble();
        String op=sc.next();
        double b = sc.nextDouble();
        double result=switch (op){
            case "더하기"-> {
                System.out.printf("%f 더하기 %f의 계산결과는 ",a,b);
                yield a+b;
            }
            case "빼기" -> {
                System.out.printf("%f 빼기 %f의 계산결과는 ",a,b);
                yield a-b;
            }
            case "곱하기"-> {
                System.out.printf("%f 곱하기 %f의 계산결과는 ",a,b);
                yield a*b;
            }
            case "나누기"-> {
                System.out.printf("%f 나누기 %f의 계산결과는 ",a,b);
                yield a/b;
            }
            default -> {
                System.out.println("사칙연산이 아닙니다.");
                isGood=1;
                yield 0;
            }
        };
        if(isGood==0)
            System.out.printf("%f",result);
        sc.close();
    }
}
