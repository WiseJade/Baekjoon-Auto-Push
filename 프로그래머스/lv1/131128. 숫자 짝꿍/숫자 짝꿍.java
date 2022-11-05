import java.util.Arrays;
import java.lang.StringBuffer;

class Solution {
    public String solution(String x, String y) {
        StringBuffer answer = new StringBuffer("");
        char[] xArr = x.toCharArray();
        char[] yArr = y.toCharArray();
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        int xIdx = 0;
        int yIdx = 0;
        while (xIdx < xArr.length && yIdx < yArr.length) {
            if (xArr[xIdx] == yArr[yIdx]) {
                answer.append(String.valueOf(xArr[xIdx]));
                xIdx++;
                yIdx++;
            } else if (xArr[xIdx] < yArr[yIdx]) {
                xIdx++;
            } else if (xArr[xIdx] > yArr[yIdx]) {
                yIdx++;
            }
        }
        if (answer.length() < 1)    return "-1";
        answer.reverse();
        String result = answer.toString();
        if (result.charAt(0) == '0') return "0";
        return result;
        // return String.valueOf(Long.parseLong(result));
    }
}