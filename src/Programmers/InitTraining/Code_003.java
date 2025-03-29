package Programmers.InitTraining;

// 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

import java.util.Arrays;

public class Code_003 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        Code_003 code = new Code_003();
        code.solution(arr);
    }

    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(arr).forEach(sb::append);
        System.out.println(sb);
        return sb.toString();
    }
}
