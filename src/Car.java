public class Car implements AutoCloseable {

    @Override
    public void close(){
        System.out.println("Машина жабылып атат");

    }
    public void  drive(){
        System.out.println("Машина журуп жатат");


    }
}
