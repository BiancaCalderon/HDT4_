package Model;

import java.util.Vector;

public class VectorStack<T> extends AbstractStack<T> {
    private Vector<T> vector;

    public VectorStack() {
        vector = new Vector<>();
    }

    @Override
    public void push(T element) {
        vector.add(element);
    }

    @Override
    public T peek() {
        if (vector.isEmpty()) {
            return null;
        }
        return vector.lastElement();
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T pull() {
        if (vector.isEmpty()) {
            return null;
        }
        T element = vector.lastElement();
        vector.remove(vector.size() - 1);
        return element;
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }

    @Override
    public int count() {
        return vector.size();
    }
}