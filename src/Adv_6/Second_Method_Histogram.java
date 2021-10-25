package Adv_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Second_Method_Histogram {


    public static void main(String[] args)
    {
        int[] histogram = new int[10];
        File file = new File("src/Adv_3/MidtermScores.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            while ((text = reader.readLine()) != null) {
                int num = Integer.parseInt(text);
                int inRange = (num-1)/10;
                histogram[inRange] = histogram[inRange] + 1;
            }

            for(int i=0; i<10; i++) {
                System.out.print("\n"+((i*10))+" - "+((i+1)*10-1)+ " : ");

                for(int j=0;j<histogram[i];j++) {
                    System.out.print("*");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}