package Controller;

import Model.AbstractStack;
import Model.IStack;
import Model.Postfix;
import Model.StackFactory;

import java.util.ArrayList;
import java.util.Stack;

public class Calculadora {


    private static boolean instance_flag = false;
    private static Calculadora _uniqueCalculator;

    public Calculadora(){
        instance_flag = true;
    }

    public static Calculadora getInstance(){
        if (!instance_flag) {
            _uniqueCalculator = new Calculadora();
        }
        return _uniqueCalculator;
    }

    Postfix calc = new Postfix();

    public void getValue(String operator, int A, int B, IStack<Integer> stack){
        switch(operator){
            case "+":
                stack.push(calc.suma(A, B));
                break;

            case "-":
                stack.push(calc.resta(A, B));
                break;

            case "*":
                stack.push(calc.multiplicacion(A, B));
                break;

            case "/":
                stack.push(calc.division(A, B));
                break;
        }
    }


    public int solve(String postfix, AbstractStack<Integer> stack){
        ArrayList<String> data = calc.getItems(postfix);
        AbstractStack<Integer> auxStack = new StackFactory<Integer>().createStack("ARRAY_LIST");

        for (String datum : data) {
            if (!calc.isOperator(datum)) {
                stack.push(Integer.valueOf(datum));
                auxStack.push(Integer.valueOf(datum));
            }
        }
        while(!stack.isEmpty()) {
            auxStack.push(stack.pull());
        }

        stack = auxStack;

        for (String datum : data) {
            if (calc.isOperator(datum)) {
                int A = stack.pull();
                int B = stack.pull();
                getValue(datum, A, B, stack);
            }
        }
        return stack.pull();
    }
}