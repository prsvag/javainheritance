public class Loops {

    public static void main(String[] args) {
        // Write a program to check candidate is eligible for voting or not
        int Candidate_1 = 15;
        int Candidate_2 = 32;
        int minimum_age = 18;

        if (minimum_age <= Candidate_1){
            System.out.println("The candidate_1 is eligible for voting");
        } if (minimum_age <= Candidate_2){
            System.out.println("The candidate_2 is eligible for voting");
        }else {
            System.out.println("not eligible");
        }
        System.out.println("----------------------------------");

        // Write a program to check if the number is positive or negative
        int p = 88;
        int n = -3;
        int z = 0;


        if (z >= p){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }

        System.out.println("----------------------------------");
        if (z <= p){
            System.out.println("The number is positive");
        }if (z >= p){
            System.out.println("The number is negative");
        }if (z == 0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is negative");
        }

        System.out.println("----------------------------------");

        // even or odd

        int no = 43;
        int noz = 0;

        if (no%2 <= noz){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");

        }


    }
}
