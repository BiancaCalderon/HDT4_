public abstract class AbstractStack<T> implements IStack<T> {
    protected int size;
    protected boolean isEmpty;


    public AbstractStack() {
        size = 0;
        isEmpty = true;
            }

            @Override
            public boolean isEmpty() {
                return size == 0;
            }

            @Override
            public int size() {
                return size;
            }

    }

