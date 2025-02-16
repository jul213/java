import java.io.*

public class carDeserialization {
    public static void main(String []args){
        Car bmw = null;

        try {
            FileInputStream fileIn = new FileInputStream("/bmw.ser");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            bmw = (Car) in.readObject();

            in.close();

            fileIn.close();
        } catch()
    }
}