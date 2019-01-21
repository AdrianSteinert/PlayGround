public class TestClass {
    public void test (){
        System.out.println("TEST");
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();

        t.test();

        int i = 12;

        System.out.println(Math.sqrt((double)i));
    }
}
