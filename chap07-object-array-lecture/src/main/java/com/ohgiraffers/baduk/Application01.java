package main.java.com.ohgiraffers.baduk;

import javax.swing.*;
import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
        String[][] baduk = new String[30][30];//배열 바둑판 가로 세로 크기 설정


        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = " ";
            }//i와 j 로 구성된 배열판 사이 사이 공백 설정
        }




        boolean test = true;
        Scanner scanner = new Scanner(System.in);//스캐너 설정
        int turn = 1;//1로 설정한 이유?->그냥 아무 숫자 넣어도 되나
//배열의 길이를 넘어선 결과가 입력되면 다시
        while (test) {
            System.out.println(((turn % 2 == 0/*두명의 순서를 위해 두가지로 나뉘어지는 임의의 상황 제시*/) ? "홍팀" : "청팀") + " 님 차례입니다.");
            // "만약 turn이 2로 나누었을 시 0일 때 "홍팀" 아니면 "청팀"
            // turn 값을 1로 설정했으니 스캐너 시작할 때 "청팀 님 차례입니다" 부터 뜬다
            String[] index = scanner.nextLine().split(" ");//split 배열을 분리시켜 주기 위해 문자열에서 기준을 정해서 구분짓기 위해
            // 좌표값 두개 입력
            int first = Integer.parseInt(index[0]);//Integer는 null 값을 가질 수 있다 -> 값이 없어도 에러가 나지 않는다 int는 에러가 난다.
            int second = Integer.parseInt(index[1]);//

            if (turn % 2 == 0) {//만약 turn%2가 0이라면 즉 홍팀이 두는 차례라면
                if (baduk[first][second].equals(" ")) {//baduk[first][second]가 " " 이라면(아무것도 없는 공백 값이라면)
                    baduk[first][second] = "O"; // 공백이었던 baduk[first][second]에 0이라는 값을 부여한다
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 다시 입력해 주세요.");//만약 baduk[first][second]가 " " 공백이 아니라 무언가 적혀 있다면
                    continue; // 다시 진행
                }
            } else {//만약 turn%2가 0이 아니라면 즉, 청팀이 두는 차례라면
                if (baduk[first][second].equals(" ")) { //baduk[first][second]가 " " 일 때(즉 아무 것도 안 적힌 공백 일 때)
                    baduk[first][second] = "X";// 공백이었던 baduk[first][second]에 X라는 값을 부여한다.
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 다시 입력해 주세요.");//만약 baduk[first][second]가 " " 공백이 아니라 무언가 적혀 있다면
                    continue;//다시 한다
                }
            }
            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();// 중간중간 "|" 막대기 설정 but why 여기다 설정이 되지 왜 위에 "" 설정과 같이 놓으면 스캐너 시뮬레이션이 달라지는거지?
            }
            turn++;
        }
    }
}
