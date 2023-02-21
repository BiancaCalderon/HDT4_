package Model;

import java.util.Vector;

public class VectorStack<T> extends AbstractStack<T> {
    private Vector<T> element;

    public VectorStack() {
        element = new Vector<T>();
        size = 0;
    }

    public void apilar(T elemento) {
        element.add(elemento);
        size++;
    }

    public T desapilar() {
        if (size == 0) {
            throw new RuntimeException("Pila vacía");
        }
        T elemento = element.remove(size-1);
        size--;
        return elemento;
    }

    public T cima() {
        if (size == 0) {
            throw new RuntimeException("Pila vacía");
        }
        return element.get(size-1);
    }

    @Override
    public void push(T element) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}