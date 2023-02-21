public interface IStack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    public int size();


    public abstract class AbstractStack<T> implements IStack<T> {
        protected int size;

        public boolean empty() {
            return size == 0;
        }
    }
}
