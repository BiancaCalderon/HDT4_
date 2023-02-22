package Model;

public class StackWithDoubleLinkedList <T> extends AbstractStack<T> {

    private DoublyLinkedList<T> InternList;

    public StackWithDoubleLinkedList() {
        InternList = new DoublyLinkedList<>();
    }

    @Override
    public int count() {
        return InternList.Count();
    }

    @Override
    public boolean isEmpty() {
        return InternList.IsEmpty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void push(T value) {
        InternList.InsertAtStart(value);
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T pull() {
        return InternList.DeleteAtStart();
    }

    @Override
    public T peek() {
        return InternList.Get(0);
    }


}

