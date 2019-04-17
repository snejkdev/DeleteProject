package kys.snejkyt.deleteproject.basic;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\Desktop\\test.txt");
        file.delete();
        System.out.println("Removed!");
    }
}
