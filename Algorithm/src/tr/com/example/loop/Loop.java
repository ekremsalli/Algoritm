package tr.com.example.loop;

import java.util.ArrayList;

public class Loop {
    public static void run(){
        ArrayList<Integer> integerList = new ArrayList<>();
        int [] array = new int [20];

        for(int i = 0; i < 20; i++){
            array[i] = i;
            integerList.add(i);
        }

        for(int i = 0; i < 20; i++)
            System.out.print(i+" ");

        System.out.println();

        for(int i = 0; i < 20; i++)
            System.out.print(integerList.get(i) + " ");

        System.out.println();

        for(int i : array)
            System.out.print(i + " ");

        System.out.println();

        for(int i : integerList)
            System.out.print(i + " ");



    }

    public static void main(String[] args) {
        run();
    }
}
