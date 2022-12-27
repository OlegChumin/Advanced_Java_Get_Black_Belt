package Part_06_Lambda;

public class Part_41_02_LambdaSample {
    static void newSomeMethod(SomeInterface someInterfaceEntity) {
        System.out.println(someInterfaceEntity.someMethod("Hi"));
    }

    public static void main(String[] args) {
        newSomeMethod((String str) -> {return str.length();}); ;
    }

    SomeInterface someInterface =  new SomeInterface() {
        @Override
        public int someMethod(String str) {
            return str.length();
        }
    };

    SomeInterface someInterface2 = str -> str.length();

    SomeInterface someInterface3 = String::length;

}

interface SomeInterface {
    int someMethod(String str);
}
