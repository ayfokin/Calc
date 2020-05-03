package itmo.java;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    private final Calculator instance = new Calculator();
    @Test
    public void testCalculator() {
        Assert.assertEquals(8, instance.action(5, 3, '+'));
        Assert.assertEquals(15, instance.action(5, 3, '*'));
        Assert.assertEquals(1, instance.action(5, 3, '/'));
        Assert.assertEquals(2, instance.action(5, 3, '-'));
        Assert.assertEquals(0, instance.action(5, 3, '&'));
        Assert.assertEquals(0, instance.action(5, 0, '/'));
    }
}
