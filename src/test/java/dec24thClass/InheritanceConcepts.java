package dec24thClass;

//Different types of inheritance in Java
//1.Single Inheritance - one parent one child
//2.Multilevel Inheritance
//3.Hierarchial inheritance
//4.Hybrid Inheritance
//5.Multiple Inheritance(not allowed in Java)

public class InheritanceConcepts {

    public static void main(String[] args) {



        ChildClass c2=new ChildClass();

        c2.square();//parentclass //will be called from child class which is a overriden method
        c2.parallelogram();;//childclass

        c2.shapes();// Grandparents class
    }


}
