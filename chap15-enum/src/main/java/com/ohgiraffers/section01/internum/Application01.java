package main.java.com.ohgiraffers.section01.internum;

public class Application01 {

    public static void main(String[] args){

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        if(subject1 == subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }

        int num = 0;
        String subjectText = "";
        switch (num){
            case Subjects.JAVA:subjectText = "JAVA"; break;
            case Subjects.ORACLE:subjectText = "ORACLE"; break;
            case Subjects.JDBC:subjectText = "JDBC"; break;
        }
        System.out.println(subjectText); //0인값을 뽑아라 -> 만약 case 항목에 Subjects.HTML 을 집어넣으면 JAVA랑 0이 중복되기 때문에 오류가 난다
        printSubject(Subjects.ORACLE);
        printSubject(2);

    }

    public static void printSubject(int subjectNumber){
        String sbj = "";
        switch (subjectNumber){
            case Subjects.JAVA:sbj=""; break;
            case Subjects.ORACLE:sbj = "ORACLE"; break;
            case Subjects.JDBC:sbj = "JDBC"; break;
        }
        System.out.println("subject : " +sbj);
    }

}
