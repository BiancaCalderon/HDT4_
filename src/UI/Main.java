package UI;

import static Model.InfixToPostfix.infixToPostfix;

public class Main {
    public static void main(String[] args) {
        String infix = "";
        String postfix = infixToPostfix(infix);
        System.out.println("Expresión infix: " + infix);
        System.out.println("Expresión postfix: " + postfix);
    }
}