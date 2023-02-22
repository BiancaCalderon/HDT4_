package Model;

import Model.IPostfix;
import Model.IStack;

import java.util.ArrayList;

/**
 * Class contains all method from a calculator
 */
public class Postfix implements IPostfix {

    @Override
    public boolean isOneItem(IStack operandos) {
        if (operandos.count()==1) {
            return  true;
        }
        return false;

    }

    /**
     * Addition method
     * @param a
     * @param b
     * @return
     */

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    /**
     * Subtraction method
     * @param a
     * @param b
     * @return
     */
    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    /**
     * Multiplication method
     * @param a
     * @param b
     * @return
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    /**
     * Divition method
     * @param a
     * @param b
     * @return
     */
    @Override
    public int division(int a, int b) {
        return a/b;
    }

    /**
     * Identifies if the String given corresponds to an operator
     * @param item
     * @return
     */
    @Override
    public boolean isOperator(String item) {
        if (item.equals("*")||item.equals("+")||item.equals("-")||item.equals("/")){
            return true;
        }
        return false;
    }


    /**
     * Receives the string from the file and returns an arrayList with splited elements.
     * @param _expresion
     * @return
     */
    @Override
    public ArrayList<String> getItems(String _expresion) {

        //Split implemented and charged into an array.

        ArrayList<String> items = new ArrayList<String>();
        String[] instructions = _expresion.split(" ");
        for (int i = 0;i<instructions.length;i++){
            items.add(instructions[i]);
        }
        return items;
    }
}
