package Adv_10;

public class code_correction1 {






    static class A {
        private static boolean s;
  //      String s = "AAA";                 // variable s is already defined in the scope

        static void methodA() {
            System.out.println(s);
        }

        static class B {                   // static declaration in inner class can't supported

            void methodB() {
                methodA();                // non-static method A . it can't be referenced from static context
            }
        }
    }
}



//   No "public class" found to execute
/**
 * _______________________________________Explanation_________________________________________________________________
  We can not call non-static method from the static method.Hence, the program will give to compile time error as below:

       java: non-static method methodA() cannot be referenced from a static context
 _____________________________________________________________________________________________________________________
**/