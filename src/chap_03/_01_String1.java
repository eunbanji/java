package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변화
        System.out.println(s.toUpperCase()); // 문장을 모두 대문자로
        System.out.println(s.toLowerCase()); // 문장을 모두 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함되면 True
        System.out.println(s.contains("C#")); // 미포함 되면 False
        System.out.println(s.indexOf("Java")); // 위치 정보 7
        System.out.println(s.indexOf("c#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음에 일치하는 위치정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true
    }
}
