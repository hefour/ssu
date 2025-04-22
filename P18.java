import java.util.InputMismatchException;
import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        int[] stunum = new int[10];
        int[] score = new int[10];
        int choice = 0;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("10명의 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ">>");
            stunum[i] = sc.nextInt();
            score[i] = sc.nextInt();
        }
        while (!exit) {
                System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        boolean isValidInput = false;
                        while (!isValidInput) {
                            try {
                                System.out.print("학번>>");
                                int inputNum = sc.nextInt();
                                isValidInput = true;
                                boolean isValid = false;
                                for (int i = 0; i < stunum.length; i++) {
                                    if (inputNum == stunum[i]) {
                                        System.out.println(score[i] + "점");
                                        isValid = true;
                                    }
                                }
                                if (!isValid) {
                                    System.out.println(inputNum + "의 학생은 없습니다.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("경고!! 정수를 입력하세요.");
                                sc.nextLine();
                            }
                        }
                    }
                    case 2 -> {
                        boolean isValidInput = false;
                        while (!isValidInput) {
                            try {
                                System.out.print("점수>>");
                                int inputScore = sc.nextInt();
                                isValidInput = true;
                                int[] corStunum = new int[10];
                                int k = 0;
                                boolean isValid = false;
                                for (int i = 0; i < score.length; i++) {
                                    if (inputScore == score[i]) {
                                        corStunum[k] = stunum[i];
                                        k++;
                                        isValid = true;
                                    }
                                }
                                if (!isValid) {
                                    System.out.printf("점수가 %d인 학생은 없습니다.\n", inputScore);
                                } else {
                                    System.out.printf("점수가 %d인 학생은 ", inputScore);
                                    for (int i = 0; i < k; i++) {
                                        System.out.print(corStunum[i] + " ");
                                    }
                                    System.out.println("입니다.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("경고!! 정수를 입력하세요.");
                                sc.nextLine();
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("프로그램을 종료합니다");
                        exit = true;
                    }
                }
            }
        sc.close();
        }
    }

