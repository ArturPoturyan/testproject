package testngexample;

import org.testng.annotations.Test;

public class TestngExample {

    @Test
    public void c_method() {
        System.out.println("I'm in method C");
    }

    @Test
    public void b_method() {
        System.out.println("I'm in method B");
    }

    @Test(priority = 0)
    public void a_method() {
        System.out.println("I'm in method A");
    }

    @Test(priority = 2)
    public void e_method() {
        System.out.println("I'm in method E");
    }

    @Test
    public void d_method() {
        System.out.println("I'm in method D");
    }
}
