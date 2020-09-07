import com.zuitt.app.Calculator;
import com.zuitt.app.Greet;

public class MainApp {
    public static void main(String[] args) {

//        Primitive Data Types
//        int - whole numbers
//        double/float - numbers with floating values (decimals)
//        boolean - true/false
//        char - for single characters

//        Non-Primitive Data Types
//        String - series of characters
//        Array/ArrayList - working with collection of values
//        HashMap - collection of named values

//        Java Operators
//          Arithmetic Operators ( + - * / % )
//          Assignment Operator ( = )
//          Comparison Operators ( ==, ===, !=, !==, <, >, <=, >= )
//          Logical Operators ( &&, ||, ! )

//        int totalScore = score - deductions;

        Greet greet = new Greet();

        String greeting = "Hello World! New test";
        int score = 100;
        int deductions = 14;

        String greetingText = greet.showGreeting(greeting);
        int totalScore = greet.scoreCalc(score, deductions);

        System.out.println(greetingText + " You got " + totalScore);
        System.out.println("==================================");

//        The 'new' keyword creates an instance of a provided class
        Calculator calculator = new Calculator();

        int score1 = 25;
        int score2 = 50;
        int newScore = calculator.add(score1, score2);

        System.out.println("New score is: " + newScore);


    }
}
