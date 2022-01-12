package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {

    private String name = "Midorya";

    void print() {
        String lastName = "Izuku";
        name = "";
        class LacalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LacalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();

    }
}
