package chap_09;

import java.util.HashMap;
import java.util.HashSet;

public class _09_Quiz {
    public static void main(String[] args) {
        HashSet<Student> index = new HashSet<>();

        index.add(new Student("유재석", "파이썬"));
        index.add(new Student("박명수", "자바"));
        index.add(new Student("김종국", "자바"));
        index.add(new Student("조세호", "C"));
        index.add(new Student("서장훈", "파이썬"));

        System.out.println("자바를 사용하는 학생");
        System.out.println("----------------");
        for (Student student : index) {
            if (student.pro.equals("자바")){
                System.out.println(student.name);
            }
        }


    }

    }

    class Student {
    public String name;
    public String pro;

    public Student(String name, String pro){
        this.name = name;
        this.pro = pro;
    }
}
