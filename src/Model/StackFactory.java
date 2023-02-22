package Model;

public class StackFactory<T> {
    public IStack<T> createStack(StackType type) {
        switch (type) {
            case ARRAY_LIST:
                return new StackArrayList<>();
            case VECTOR:
                return new VectorStack<>();
            case SINGLE_LIST:
                return new StackWithSingleLinkedList<>();
            case DOUBLE_LIST:
                return new StackWithDoubleLinkedList<>();
            default:
                throw new IllegalArgumentException("Unknown stack type: " + type);
        }
    }
    public enum StackType {
        ARRAY_LIST,
        VECTOR,
        SINGLE_LIST,
        DOUBLE_LIST

}
    }