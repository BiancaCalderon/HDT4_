package Model;

public interface IStack<T> {
    void push(T element);
    T pop();
    T peek();
    T pull();
    boolean isEmpty();
    public int size();

    int count();
}
