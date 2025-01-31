package dec24thClass;

//extends is used to inheirt the data from the parent class
//Inherit the data means  inherit the methods, variables or objects from the parent class

//In java we can inherit only one class at a time
//because of daimond problem - when a class inherits multiple classes
//and two child class want to inherit the properties java gets confused on which class to inherit

public class ChildClass extends ParentClass {

public void rhombus(){

    System.out.println("This is a rhombus");
}

public void parallelogram(){

    System.out.println("This is a parallelogram  ");

}

//Method Overriding ---> Runtime Polymorphism
    //When both the methods from the arent class and child class have same naame and same set of arguments
    //then the child class will take the precedence


    @Override//This annotation will decide  whether this method is overriden or not
    public void square(){

        super.square();

    System.out.println("This is a square from the child class");
}


}
