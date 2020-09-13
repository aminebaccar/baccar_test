import default_package.MainClazz;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainClazzTest {
    private MainClazz mainClazz = new MainClazz();

    @Test
    void multiply() {
        int result = mainClazz.multiply(10,45);
        Assert.assertEquals(450, result);
    }

    @Test
    void divide() {
        int result = mainClazz.divide(100,10);
        Assert.assertEquals(10, result);
    }

    @Test
    void add() {
        int result = mainClazz.add(100,1);
        Assert.assertEquals(101, result);
    }

    @Test
    void substract() {
        int result = mainClazz.substract(100,1);
        Assert.assertEquals(99, result);
    }
}