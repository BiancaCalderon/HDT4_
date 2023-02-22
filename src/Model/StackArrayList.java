package Model;

import Model.AbstractStack;

import java.util.ArrayList;

public class StackArrayList<T> implements IStack<T> {
    private ArrayList<T> elementos;

    public StackArrayList() {
        elementos = new ArrayList<T>();
    }

    @Override
    public int count() {
        return elementos.size();
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public void push(T value) {
        elementos.add(0, value);
    }

    @Override
    public T pull() {
        return elementos.remove(0);
    }

    @Override
    public T peek() {
        return elementos.get(0);
    }
}
