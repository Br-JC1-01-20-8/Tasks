package jc01_2020.classwork.junit;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathTest {

    @Mock
    private Logic logic;

    private Math math;

    @Before
    public void setUp() {
        math = new Math(logic, "string");
    }

    @After
    public void tearDown() {
        Mockito.verifyNoMoreInteractions(logic);
    }

    @Test
    public void addTest() {
        int result = math.sum(7, 5);
        Assert.assertThat(result, CoreMatchers.is(12));
    }

    @Test
    public void addSomethingTest() {
        Mockito.when(logic.getSomething()).thenReturn(10);
        int result = math.otherSum(7, 5);
        Assert.assertThat(result, CoreMatchers.is(32));
        Mockito.verify(logic, Mockito.times(2)).getSomething();
    }

    @Test
    public void multiplyTest() {
        int result = math.multiply(7, 5);
        Assert.assertThat(result, CoreMatchers.is(35));
    }

}
