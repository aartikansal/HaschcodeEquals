package Access;

public class ExampleClass {
    public void publicMethod(){}
    protected void protectedMethod(){}
    private void privateMethod(){}
    void defaultMethod(){}
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.privateMethod();
        exampleClass.defaultMethod();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();



    }
}
