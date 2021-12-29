package Adv_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// public class created as name Histogram
public class Histogram {

        // main method called
        public static void main(String[] args) throws IOException {
            File file = new File("src/Adv_6/ MidtermScores.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;

            int rng0to9 = 0, rng10to19 = 0, rng20to29 = 0, rng30to39 = 0, rng40to49 = 0, rng50to59 = 0, rng60to69 = 0;
            int rng70to79 = 0, rng80to89 = 0, rng90to99 = 0, rng100 = 0;


            while ((str = br.readLine()) != null) {

                int x = Integer.parseInt(str);
                if (x >= 0 && x <= 9)
                    rng0to9++;
                else if (x >= 10 && x <= 19)
                    rng10to19++;

                else if (x >= 20 && x <= 29)
                    rng20to29++;
                else if (x >= 30 && x <= 39)
                    rng30to39++;
                else if (x >= 40 && x <= 49)
                    rng40to49++;
                else if (x >= 50 && x <= 59)
                    rng50to59++;
                else if (x >= 60 && x <= 69)
                    rng60to69++;
                else if (x >= 70 && x <= 79)
                    rng70to79++;
                else if (x >= 80 && x <= 89)
                    rng80to89++;
                else if (x >= 90 && x <= 99)
                    rng90to99++;
                else if (x == 100)
                    rng100++;

            }
            System.out.print("00 to 09 : ");
            for(int i=0; i<rng0to9; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("10 to 19 : ");
            for(int i=0; i<rng10to19; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("20 to 29 : ");
            for(int i=0; i<rng20to29; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("30 to 39 : ");
            for(int i=0; i<rng30to39; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("40 to 49 : ");
            for(int i=0; i<rng40to49; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("50 to 59 : ");
            for(int i=0; i<rng50to59; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("60 to 69 : ");
            for(int i=0; i<rng60to69; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("70 to 79 : ");
            for(int i=0; i<rng70to79; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("80 to 89 : ");
            for(int i=0; i<rng80to89; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("90 to 99 : ");
            for(int i=0; i<rng90to99; i++)
                System.out.print("*");
                System.out.println("\n");

            System.out.print("100: ");
            for(int i=0; i==rng100; i++)
                System.out.print("*");
                System.out.println("\n");

        }
    }


