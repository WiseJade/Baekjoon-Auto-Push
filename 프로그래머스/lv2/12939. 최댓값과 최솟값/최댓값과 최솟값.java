class Solution {
    public String solution(String s) {
        String[] sArray = s.split(" ");
        int max = Integer.parseInt(sArray[0]);
        int min = Integer.parseInt(sArray[0]);
        for (String num : sArray) {
            max = Math.max(max, Integer.parseInt(num));
            min = Math.min(min, Integer.parseInt(num));
        }
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}