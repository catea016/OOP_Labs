package lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Laboratory4 {
    public static void main(String[] args) throws FileNotFoundException
    {

        //Scanner Example - read file line by line in Java using Scanner
        FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Catea\\\\IdeaProjects\\\\Laboratoare_OOP\\\\OOP_Labs\\\\src\\\\lab4\\\\three_expressions.txt");
        Scanner scanner = new Scanner(fis);
        ParenthesesChecker parenthesesChecker = new ParenthesesChecker();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
            char ch[]= line.toCharArray();

            if (parenthesesChecker.areParenthesisCorrect(ch))
                System.out.println("Correct ");
            else
                System.out.println("Not correct ");
        }

        scanner.close();

    }


}
