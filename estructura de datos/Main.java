
public class stack<T>{

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
}

public class Main{

    public static void main(String[] args){
        stack<Integer> ints = new stack<Integer>();
        ints.push(20);
        ints.push(25);
        ints.push(30);
        ints.push(40);
    }
}