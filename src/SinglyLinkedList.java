public class SinglyLinkedList<T> extends AbstractList<T> {
    private Node<T> head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(T item) {
        head = new Node<>(item, head);
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T temp;
        if (index == 0) {
            temp = head.data;
            head = head.next;
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            temp = node.next.data;
            node.next = node.next.next;
        }
        size--;
        return temp;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}