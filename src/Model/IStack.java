package Model;

public interface IStack<T> {
    void push(T element);
    T peek();

    T pop();

    T pull();
    boolean isEmpty();

    int count();

    int size();
}
