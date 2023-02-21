package Model;

import Model.AbstractStack;

import java.util.ArrayList;

public class StackArrayList<T> extends AbstractStack<T> {
    private ArrayList<T> elementos;

    public StackArrayList() {
        elementos = new ArrayList<T>();
    }

    @Override
    public void push(T element) {
        elementos.add(element);
        isEmpty = false;
        size++;
    }

    @Override
    public T pop() {
        T element = elementos.remove(elementos.size() - 1);
        size--;

        if (size == 0) {
            isEmpty = true;
        }

        return element;
    }

    @Override
    public T peek() {
        return elementos.get(elementos.size() - 1);
    }
}
