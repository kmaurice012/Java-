public class Main {
    //LOOP AND CHECK
    public static void main(String[] args) {
//        String name = "John";
////        int age = 18;
//        int ages[]= {10,12,13,14,15,16,16,20,59};
//
//        for (int x : ages)
//        {
//            if(x >= 18){
//                System.out.println(name +' '+ x +' '+ "is Fucking Old");
//            }
//            else{
//                System.out.println(name +' '+ x +' '+ "is Fucking Young");
//            }
//        }
        //Starting with an input string of words, find the second-to-last word of the string.
// For example, an input of “I love Codecademy” should return “love.”
//  To make your program more challenging, allow for a second numerical input, n,
//  that results in returning the nth word of a string. So, for the string “I can
//  program in Java” and n = 3, the output should be the third word, “program.”
//
//

        String quiz = "I love Codecademy";

        System.out.println(quiz.substring(1,6).toUpperCase());

    }
}