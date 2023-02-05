package instance;

public class MyObject extends ObjectTwo {
    public static void main(String[] args) {
        ObjectTwo o=new MyObject();
        System.out.println(o instanceof ObjectTwo);
        System.out.println(getA());

    }
}
class ObjectTwo{

    private static int a=3;

    public static int getA() {
        return a;
    }
}
