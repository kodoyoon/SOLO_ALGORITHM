package Inflearn.HaruCoding;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
    // 입력값을 String 변수 sNum 에 저장한 후 char[] 형 변수로 변환하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i<cNum.length; i++) {
            sum += cNum[i]-'0'; //cNum[i] 를 정수형으로 변환하면서 sum 에 더하며 누적시키기
        }
        System.out.println(sum);
    }
}
