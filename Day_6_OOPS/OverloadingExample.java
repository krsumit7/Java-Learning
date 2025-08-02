/*public class OverloadingExample {
    void greet(String name) {
        System.out.println("Hello " + name);
    }
    void greet(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.greet("Sumit");
        obj.greet("Sumit", 23);
    }
}   */

public class OverloadingExample{
    void healthcondition(String name) {
        System.out.println("how's your health " + name + "?");
    }
    void healthcondition(String name, int age) {
        System.out.println("how's your health " + name + "? are you a chain smoker ? " + age + " years old.");
    }
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.healthcondition("Sudhir");
        obj.healthcondition("Sudhir", 25);
    }
}
