package main.java.com.ohgiraffers.section03.dto;

public class MemberDTO {

    /*
    * DTO(Data Transfer Object)의 약자로 계층간의 데이터 전송을 위해 도메인 모델 대신 사용되는 객체이다.* */
    // view->controller->model 간의 데이터 이동을 위해 쓰임(mvc 모델)


    private int number; // 회원 번호
    private String name; // 회원 이름
    private int age; // 회원 나이
    private char gender;// 회원 성별
    private double weight;// 몸무게
    private boolean isActivated;// 활동 상태

    //private이라 외부에서 참조를 못하기 때문에 getter와 setter 작성(alt + insert 의 getter&setter)


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
