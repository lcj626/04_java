package main.java.com.ohgiraffers.section04.sort;

public class Application02 {

    public static void main(String[] args){


        int[] arr = {2,5,4,6,1,3};

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int x:arr) {
            System.out.println(x + " ");
        }
    }
}
