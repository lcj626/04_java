package main.java.com.ohgiraffers.section04.use2;

public class FileSaveProvider implements SaveProvider{
    @Override
    public boolean save(String data) {
        System.out.println("file Save " + data);
        return false;
    }
}
