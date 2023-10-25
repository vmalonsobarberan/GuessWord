public class Test {
    public static void main(String[] args) {
        String s = "hello";
        String s2 = "Hello";
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
