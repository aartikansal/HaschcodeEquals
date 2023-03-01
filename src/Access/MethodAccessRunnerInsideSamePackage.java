package Access;

public class MethodAccessRunnerInsideSamePackage {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        //exampleClass.privateMethod(); you cannot access private
        exampleClass.defaultMethod();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();


    }
}
