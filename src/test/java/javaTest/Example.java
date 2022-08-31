package javaTest;

public class Example {

    public void test(){
        System.out.println("This should be fun");
    }
    private void testTwo(){
        System.out.println("This should be fun to test");
    }

    public static void main(String[] args){
        System.out.println("This is so so fun");

        Example example = new Example();
        example.test();

    }
}
