package main.java.com.ohgiraffers.test.login;

public class LogIn {

    private String id;
    private int pwd;


    public LogIn(String id, int pwd){
        this.id = id;
        this.pwd = pwd;

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id =id;
    }

    public int getPwd(){
        return pwd;
    }

    public void setPwd(){
        this.pwd = pwd;
    }






}
