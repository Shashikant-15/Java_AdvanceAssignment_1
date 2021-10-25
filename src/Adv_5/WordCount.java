package Adv_5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {


    public static void main(String[] args)
    {
        BufferedReader reader = null;

        //Initializing charCount, wordCount and lineCount to 0

        int Ch_Count   = 0;

        int Wrd_Count  = 0;

        int Line_Count = 0;

        try
        {
            //Creating BufferedReader object

            reader = new BufferedReader(new FileReader("src/Adv_5/lear.txt"));

            //Reading the first line into currentLine

            String present_Line = reader.readLine();

            while (present_Line != null)
            {
                //Updating the lineCount

                Line_Count ++;

                //Getting number of words in currentLine

                String[] words = present_Line.split(" ");

                //Updating the wordCount

                Wrd_Count = Wrd_Count + words.length;

                //Iterating each word

                for (String word : words)
                {
                    //Updating the charCount

                    Ch_Count = Ch_Count + word.length();
                }

                //Reading next line into currentLine

                present_Line = reader.readLine();
            }

            //Printing charCount, wordCount and lineCount





            System.out.println("No. of Lines     : "+ Line_Count);
            System.out.println("No. of Words     : "+ Wrd_Count);
            System.out.println("No. of Character : "+ Ch_Count);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                assert reader != null;
                reader.close();           //Closing the reader
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}