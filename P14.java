import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** 갬블링 게임을 시작합니다. ******");
        boolean isValid=true;
        while (isValid) {
            while(true) {
                System.out.print("엔터키 입력>>");
                String a = sc.nextLine();
                if (a.isEmpty()) {
                    break;
                }else
                    System.out.println("엔터키를 입력하세요");
            }

            int[] num=new int[3];
            for(int i=0; i<num.length; i++){
                num[i]=(int)(Math.random()*3);
                System.out.printf("%-4d",num[i]);
            }
            System.out.println();
            if(num[0]==num[1]&&num[1]==num[2]){
                System.out.println("성공! 대박났어요!");
                while(true){
                    System.out.print("계속하시겠습니까?(yes/no)>>");
                    String choice=sc.nextLine();
                    if(choice.equals("no")||choice.equals("yes")) {
                        if(choice.equals("no")){
                            isValid=false;
                        }
                        break;
                    }else
                        System.out.println("잘못된 입력값입니다! 다시입력하세요.");
                }
            }

        }

    }
}
