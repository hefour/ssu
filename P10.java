import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        int [][] num=new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                num[i][j]=(int)(Math.random()*256);
                System.out.printf("%-4d",num[i][j]);
            }
            System.out.println();

        }
        System.out.print("임계값 입력>>");
        int thres=sc.nextInt();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(num[i][j]>thres){
                    num[i][j]=255;
                }else
                    num[i][j]=0;
                System.out.printf("%-4d",num[i][j]);
            }
            System.out.println();
        }

    }
}
