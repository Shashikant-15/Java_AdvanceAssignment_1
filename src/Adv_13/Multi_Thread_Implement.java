package Adv_13;



import java.util.Random;
import java.util.Scanner;

public class Multi_Thread_Implement {


    public static void main(String[] args) {
        RandomNumber th=new RandomNumber();
        th.start();
    }
}
class RandomNumber extends Thread {
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the specific number up to  you want to generate square and cube of Random number");
        int numOfRandom= scanner.nextInt();
        Random random = new Random();
        for(int i=0;i<numOfRandom;i++){
            int randomNumber = random.nextInt(100);
            System.out.print("Generating");
            for (int j =0; j<5; j++){
//                we are printing . every half second for waiting
                System.out.print(".");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            System.out.println();
            if(randomNumber % 2==0){
                SquareThread squareThread=new SquareThread(randomNumber);
                squareThread.start();
            }else{
                CubeThread cubeThread=new CubeThread(randomNumber);
                cubeThread.start();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
class SquareThread extends Thread {
    int num;
    SquareThread(int number){
        this.num = number ;
    }
    public void run(){
        System.out.println("Square of "+num+" : "+num * num);
    }
}
class CubeThread extends Thread{
    int number;
    CubeThread(int number){
        this.number = number;
    }
    public void run(){
        System.out.println("Cube of "+number+" : "+number*number*number);
    }
}