package sub1;

/*
 * 날짜 : 2026/05/01
 * 이름 : 허민재
 * 내용 : 프로그래머스 기출문제 1번 문자출력
 */ 


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<10; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}