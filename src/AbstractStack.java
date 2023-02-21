public abstract class AbstractStack<T> implements IStack<T> {
    protected int tamano;
    protected boolean isEmpty;


    public AbstractStack() {
        tamano = 0;
        isEmpty = true;
            }

            @Override
            public boolean isEmpty() {
                return isEmpty;
            }

            @Override
            public int size() {
                return tamano;
            }

    }

