public class StaticVsNonStatic {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        new StaticVsNonStatic();
        new StaticVsNonStatic();
        new StaticVsNonStatic();
    }

    static{
        System.out.println("Inside static block");
    }
    {
        System.out.println("Inside non static block");
    }
}
