import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // id_list 배열과 같은 크기의 결과값을 담을 배열 선언
        int[] answer = new int[id_list.length];
        // id_list 배열과 같은 순서로 누가 이 유저를 신고했는지 담을 리스트 선언
        // 리스트의 요소로 String 형 리스트로 신고자 리스트를 담는다.
        List<ArrayList<String>> report_list = new ArrayList<>();
        // 신고자 리스트 안의 요소에 리스트 초기화
        for (int i = 0; i < id_list.length; i++) {
            report_list.add(new ArrayList<String>());
        }
        // 아이디 리스트를 List 형식으로 옮긴다.
        List<String> list = Arrays.asList(id_list);
        // report를 순회한다.
        for (String s : report) {
            // 신고받은 사람과 신고한 사람을 나눠서 변수에 저장
            String[] sArr = s.split(" ");
            String reporter = sArr[0];
            String accepter = sArr[1];
            // 신고당한 사람의 list에서의 인덱스를 찾는다.
            int index = list.indexOf(accepter);
            // 찾은 인덱스의 report리스트에 신고한 사람이 있다면
            if (report_list.get(index).contains(reporter)) {
                // 추가하지 않고 계속한다. (신고는 몇번을 하든 1번이다.)
                continue;
            }
            // reporter가 accepter를 처음 신고하는 것이면 report 리스트에 추가한다
            report_list.get(index).add(reporter);
        }
        // report 리스트를 순회한다.
        for (int i = 0; i < report_list.size(); i++) {
            // 리스트의 요소 크기가 k이상이면
            if (report_list.get(i).size() >= k) {
                // 리스트의 요소 내에 있는 아이디를 순회한다.
                for (int j = 0; j < report_list.get(i).size(); j++) {
                    String id = report_list.get(i).get(j);
                    // j번째 아이디의 id index를 찾는다.
                    int id_index = list.indexOf(id);
                    // answer의 id index 에 1 더한다.
                    answer[id_index]++;
                }
            }
        }
        return answer;
    }
}