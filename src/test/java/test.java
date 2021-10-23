import org.junit.Assert;
import org.junit.Test;

public class test {
    
    @Test
    public void test1() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(5.00, -0.01);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test2() {
        String eOutput = "Truot";
        String aOutput = main.checkDiem(5.00, 0.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test3() {
        String eOutput = "Truot";
        String aOutput = main.checkDiem(5.00, 0.01);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test4() {
        String eOutput = "Trung binh";
        String aOutput = main.checkDiem(5.00, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test5() {
        String eOutput = "Gioi";
        String aOutput = main.checkDiem(5.00, 9.99);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test6() {
        String eOutput = "Gioi";
        String aOutput = main.checkDiem(5.00, 10.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test7() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(5.00, 10.01);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test8() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(-0.01, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test9() {
        String eOutput = "Truot";
        String aOutput = main.checkDiem(0.00, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test10() {
        String eOutput = "Truot";
        String aOutput = main.checkDiem(0.01, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test11() {
        String eOutput = "Kha";
        String aOutput = main.checkDiem(9.99, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test12() {
        String eOutput = "Kha";
        String aOutput = main.checkDiem(10.00, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test13() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(10.01, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test14() {
        String eOutput = "Trung binh";
        String aOutput = main.checkDiem(4.25, 3.75);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test15() {
        String eOutput = "Trung binh";
        String aOutput = main.checkDiem(5.00, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test16() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(-2.00, 5.00);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test17() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(5.00, 10.01);
        Assert.assertEquals(eOutput, aOutput);
    }

    @Test
    public void test18() {
        String eOutput = "Diem khong hop le";
        String aOutput = main.checkDiem(-2.00, 10.01);
        Assert.assertEquals(eOutput, aOutput);
    }
}
