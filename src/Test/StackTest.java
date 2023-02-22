package Test;

import Controller.Calculadora;
import Model.AbstractStack;
import Model.IList;
import Model.IStack;
import Model.StackFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class StackTest {

    IStack<Integer> stack;

    @Before
    public void setUp() {
        stack = new StackFactory<Integer>().createStack("LINKED_LIST");
    }

    @Test
    public void testPushAndPull() {
        stack.push(5);
        stack.push(10);
        assertEquals(10, (int) stack.pull());
        assertEquals(5, (int) stack.pull());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push(5);
        stack.push(10);
        assertEquals(2, stack.size());
    }
    public class CalculadoraTest {

        Calculadora calculadora;

        @Before
        public void setUp() {
            calculadora = Calculadora.getInstance();
        }

        @Test
        public void testSolve() {
            AbstractStack<Integer> stack = new StackFactory<Integer>().createStack("ARRAY_LIST");
            int result = calculadora.solve("2 3 +", stack);
            assertEquals(5, result);

            stack = new StackFactory<Integer>().createStack("LINKED_LIST");
            result = calculadora.solve("2 3 * 4 +", stack);
            assertEquals(10, result);

            stack = new StackFactory<Integer>().createStack("ARRAY_LIST");
            result = calculadora.solve("3 4 * 5 -", stack);
            assertEquals(-7, result);

            stack = new StackFactory<Integer>().createStack("LINKED_LIST");
            result = calculadora.solve("10 5 /", stack);
            assertEquals(2, result);
        }
    }

    public class ListTest {

        IList<Integer> list;

        @Before
        public void setUp() {
            list = (IList<Integer>) new LinkedList<Integer>();
        }

        @Test
        public void testAdd() {
            list.add(5);
            list.add(10);
            assertEquals(2, list.longitud());
            assertEquals(10, (int) list.get(1));
        }

        @Test
        public void testIsEmpty() {
            assertTrue(list.isEmpty());
            list.add(5);
            assertFalse(list.isEmpty());
        }

        @Test
        public void testSize() {
            assertEquals(0, list.longitud());
            list.add(5);
            list.add(10);
            assertEquals(2, list.longitud());
        }
    }
}