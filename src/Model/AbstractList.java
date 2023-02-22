package Model;

import Model.IList;

public abstract class AbstractList<T> implements IList<T> {
    protected int size;

    public int longitud() { //almacena el número de elementos en la lista
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}