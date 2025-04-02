import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("여행지>>");
        String des=sc.nextLine();
        System.out.print("인원수>>");
        int pCount=sc.nextInt();
        System.out.print("숙박일>>");
        int sCount=sc.nextInt();
        System.out.print("1인당 항공료>>");
        int costPerF=sc.nextInt();
        System.out.print("1방 숙박비>>");
        int costPerN=sc.nextInt();
        int nPerP=pCount/2+pCount%2;
        int total=nPerP*costPerN*sCount+pCount*costPerF;
        System.out.printf("%d명의 %s %d박 %d일 여행에는 방이 %d개 필요하며 경비는 %d원입니다.",pCount,des,sCount,sCount+1,nPerP,total);
        sc.close();
    }
}