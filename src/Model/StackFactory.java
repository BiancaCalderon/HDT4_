package Model;

public class StackFactory<T> {
    public AbstractStack<T> createStack(String type) {
        switch (type) {
            case "ARRAY_LIST":
                return new StackArrayList<>();
            case "VECTOR":
                return new VectorStack<>();
            case "SINGLE_LIST":
                return new StackWithSingleLinkedList<>();
            case "DOUBLE_LIST":
                return new StackWithDoubleLinkedList<>();
            default:
                throw new IllegalArgumentException("Unknown stack type: " + type);
        }
    }

    }