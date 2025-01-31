package dec30thClass.functionalInterfaces;

public class ImplemntInterfaces implements FunctionalInterfaceConcepts {

    @Override
    public void sample() {
        System.out.println("Sample method is implemented in current class");

    }

    public static void main(String[] args) {
        ImplemntInterfaces i4=new ImplemntInterfaces();
        i4.sample();
    }
}
