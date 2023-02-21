package Model;

public interface IStack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    public int size();

    int count();
}
