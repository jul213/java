abstract class SuperClass {
    abstract int calculate(int a);
}

abstract class hoal {
    abstract void method1();
    static int method2(int a){
        return a * a;
    }
}

class sas extends SuperClass {
    public int calculate(int a){
        return a * a;
}