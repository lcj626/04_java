package main.java.com.ohgiraffers.section05.parameter;

public class BaekJunTest1_RectAngle {

    private double width;
    private double height;


    public BaekJunTest1_RectAngle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BaekJunTest1_RectAngle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
