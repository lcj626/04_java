package main.java.com.ohgiraffers.section04.use2;

public class DatabaseSaveProvider implements SaveProvider{

    @Override
    public boolean save(String data) {
        System.out.println("data Save " + data);
        return false;
    }
}
