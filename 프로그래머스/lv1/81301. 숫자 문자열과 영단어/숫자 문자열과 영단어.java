import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String result = s;
        for (int i = 0; i < numbers.length; i++) {
            if (result.contains(numbers[i])) {
                result = result.replace(numbers[i], String.valueOf(i));
            }
        }
        answer = Integer.parseInt(result);
        return answer;
    }
}