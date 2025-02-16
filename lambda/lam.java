public class Main {
    public static void main(String[] args){

        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("test 1");
            }
        }

    }

    Runnable r2 = () -> System.out.println("test 2");
    r1.run();
    r2.run();
}