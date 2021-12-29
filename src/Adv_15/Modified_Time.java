package Adv_15;

import java.io.File;
import java.util.Date;

// a public class generate as name Modified_Time
public class Modified_Time {

    // main method called here
    public static void main(String[] args) {

        File file1 = new File("src/Adv_15/test1.txt"); // copied the path of file from their location.

        Date date=new Date(file1.lastModified());

        System.out.println("\nThe file was last modified on: " +date+ "\n");
    }
}