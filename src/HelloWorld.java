public class HelloWorld {
    public static void main (String[] argv) {
        System.out.println("Hello World");
        System.out.println("You entered the following arguments");
        for(String s : argv) System.out.println(s);
    }
}
