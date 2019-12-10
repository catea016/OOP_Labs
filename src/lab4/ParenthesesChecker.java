package lab4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class ParenthesesChecker {
       /* static class stack
        {
            int top=-1;
            char items[] = new char[100];

            void push(char x)
            {
                if (top == 99)
                {
                    System.out.println("Stack full");
                }
                else
                {
                    items[++top] = x;
                }
            }

            char pop()
            {
                if (top == -1)
                {
                    System.out.println("Underflow error");
                    return '\0';
                }
                else
                {
                    char element = items[top];
                    top--;
                    return element;
                }
            }

            boolean isEmpty()
            {
                return (top == -1) ? true : false;
            }
        }*/
        static boolean isMatchingPair(char character1, char character2) {
            if (character1 == '(' && character2 == ')')
                return true;
            else
                return false;
            }

       public static boolean areParenthesisCorrect(char exp[])
        {
            /* Declare an empty object` stack */
            //stack st=new stack();
            Stack stack = new Stack();

            for(int i=0;i<exp.length;i++)
            {

          /*If the exp[i] is a starting
            parenthesis then push it*/
                if (exp[i] == '(' )
                    stack.push(exp[i]);

                if (exp[i] == ')' )
                {

              /* If we see an ending parenthesis without
                 a pair then return false*/
                    if (stack.isEmpty())
                    {
                        return false;
                    }
                    else if ( !isMatchingPair((Character) stack.pop(), exp[i]) )
                    {
                        return false;
                    }

                }

            }

            return stack.isEmpty();
        }

}


