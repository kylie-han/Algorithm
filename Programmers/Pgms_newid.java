public class Pgms_newid {
    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";
        System.out.println(solution(new_id));
    }
    /**
01단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
02단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
03단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
04단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
05단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
06단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
     */
    private static String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        new_id = new_id.toLowerCase();
        for (char c : new_id.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.subSequence(i, i + 2).equals("..")) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        if (sb.charAt(0) == '.')
            sb.deleteCharAt(0);
        if (sb.length()>0 && sb.charAt(sb.length() - 1) == '.')
            sb.deleteCharAt(sb.length() - 1);
        if (sb.length() == 0)
            sb.append("a");
        if (sb.length() >= 15) {
            sb.delete(15, sb.length());
            if (sb.charAt(sb.length() - 1) == '.')
                sb.deleteCharAt(sb.length() - 1);
        }
        while (sb.length() < 3) {
            sb.append(sb.charAt(sb.length() - 1));
        }
        answer = sb.toString();
        return answer;
    }
}
