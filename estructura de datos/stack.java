
public class stack<T>{

    int index = 0;
    T[] arr = new T[100];
    public void push(T element){
        arr[index++] = element;
    }

    public T pop(){
        return arr[index--];
    }

    public T get(T elemento){
        return arr[elemento];
    }
}