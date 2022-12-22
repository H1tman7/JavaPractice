package practice23.Task2;

/*
Определите интерфейс очереди Queue и опишите его контракт.
 */

public interface Queue {
    void enqueue(Object element);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
