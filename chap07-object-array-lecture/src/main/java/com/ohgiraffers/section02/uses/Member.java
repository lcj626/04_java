package main.java.com.ohgiraffers.section02.uses;

public class Member {

    private int num;
    private String id;
    private String pwd;

    private String name;
    private int age;
    private char gender;


    public Member(){}//생성자

    Member(int num, String id, String pwd, String name, int age, char gender){
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }//필드 초기화 생성자 default 접근제한자

    public int getNum() {
        return num;
    }//매개변수 x 리턴만 존재 -> 자기 자신을 반환

    public void setNum(int num) {
        this.num = num;
    }//반환 타입 x 매개변수만 존재

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getInfo() { // (no==1) -6  인스턴스의 필드를 문자열로 만들어서 반환한다. regist로 다시 돌아감 //((no==2시)-8) 인스턴스의 필드를 문자열로 만들어서 반환한다.
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }//오버라이드 - 부모가 준 건물을 내가 리모델링 해서 다르게 쓰겠다 내가 상속받아서 재정의 하겠다
}
