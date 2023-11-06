package main.java.com.ohgiraffers.story;

public class Jobs {

    private int num;
    private String jobName;

    public Jobs(int num, String jobName) {
        this.num = num;
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "num=" + num +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
