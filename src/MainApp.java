import com.zuitt.app.Calculator;
import com.zuitt.app.Greet;
import com.zuitt.app.TemperatureConverter;

import java.util.ArrayList;

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

        System.out.println("==================================");
        System.out.println(greetingText + " You got " + totalScore);
        System.out.println("==================================");

//        The 'new' keyword creates an instance of a provided class
        Calculator calculator = new Calculator();

        int score1 = 25;
        int score2 = 50;
        int newScore = calculator.add(score1, score2);

        System.out.println("New score is: " + newScore);
        System.out.println("++++++++++++++++++++++++++++++++++");

        TemperatureConverter converter = new TemperatureConverter();

        double waterFreezingPoint = 0;
        double waterBoilingPoint = 100;
        double humanNormalTemp = 37;

        String temperatureMetric = "test";

        if(temperatureMetric.equals("celsius")) {
            System.out.println(converter.celsiusToFahrenheit(waterFreezingPoint));
            System.out.println(converter.celsiusToFahrenheit(humanNormalTemp));
            System.out.println(converter.celsiusToFahrenheit(waterBoilingPoint));
        } else {
            System.out.println(converter.fahrenheitToCelsius(waterFreezingPoint));
            System.out.println(converter.fahrenheitToCelsius(humanNormalTemp));
            System.out.println(converter.fahrenheitToCelsius(waterBoilingPoint));
        }

        System.out.println("++++++++++++++++++++++++++++++++++");

        switch (temperatureMetric) {
            case "celsius":
                System.out.println(converter.celsiusToFahrenheit(waterFreezingPoint));
                System.out.println(converter.celsiusToFahrenheit(humanNormalTemp));
                System.out.println(converter.celsiusToFahrenheit(waterBoilingPoint));
                break;

            case "fahrenheit":
                System.out.println(converter.fahrenheitToCelsius(waterFreezingPoint));
                System.out.println(converter.fahrenheitToCelsius(humanNormalTemp));
                System.out.println(converter.fahrenheitToCelsius(waterBoilingPoint));
                break;

            default:
                System.out.println("Invalid metric");
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("counter: " + (i + 1));
        }

        int[] listOfScores = new int[5];
        System.out.println(listOfScores.length);

        int[] listOfGrades = {75, 75, 75, 75};
        System.out.println(listOfGrades.length);

        ArrayList favoriteInstructor = new ArrayList<String>();

        favoriteInstructor.add("Renz");
        favoriteInstructor.add("Charles");
        favoriteInstructor.add("Terence");
        favoriteInstructor.add("Alfred");

        System.out.println("Displaying list of instructors");
        System.out.println(favoriteInstructor.get(0));

        favoriteInstructor.set(0, "Alan");
        System.out.println(favoriteInstructor.get(0));

        favoriteInstructor.forEach((instructor) -> {
            System.out.println(instructor);
        });
    }
}
