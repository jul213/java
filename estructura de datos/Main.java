import java.util.Iterator;
    class Stack<T> implements Iterable<T>{

    int index = 0;
    private Object[] arr = new Object[100];
    public void push(T element){
        arr[index++] = element;
    }

    public T pop(){
        return (T) arr[--index];
    }

    public T get(int indice){
        return (T) arr[indice];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < index;
            }

            @Override
            public T next() {
                return (T) arr[currentIndex++];
            }
        };
    }
}

public class Main{

    public static void main(String[] args){
        Stack<Integer> ints = new Stack<>();
        ints.push(20);
        ints.push(25);
        ints.push(30);
        ints.push(40);

        Iterator<Integer> it = ints.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }
}