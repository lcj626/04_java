package main.java.com.ohgiraffers.section02.enumtype;

public enum Subjects {//enum 상수형 열거 필드

    JAVA("java"), ORACLE("oracle"), JDBC("jdbc"), HTML("html"), CSS("css"), JAVASCRIPT("javascript");
    //사실 기본생성자가 옆에 붙어있는 상태 ->JAVA() 그래서 일반 생성자를 만들면 오류남

    private String value;

    Subjects(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "value='" + value + '\'' +
                '}';
    }
}
