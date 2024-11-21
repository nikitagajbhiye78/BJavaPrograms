package OCT.Ternary_Operators;

public class Nested_Ternary {
    public static void main(String[] args) {

       //Syntax result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        //Grade- Score - 90-->A
        //Grade- Score - 85-->B
        //Grade- Score - 75-->C
        //Grade- Score - 60-->D

        int score = 75;
        String grade = (score>=90)? "A" :(score>=85)? "B": (score>=75)? "C" : (score>=60)? "D" : "F";
        System.out.println("Your grade is " +grade);



    }
}
