package com.github.kurkov.basepatterns.creational.prototype.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class PrototypeTest {

    @Test
    public void comparePrototypeToOriginalObject1() {
        ConcretePrototype1 obj = new ConcretePrototype1(1, "SuperPrototype");
        ConcretePrototype1 objClone = (ConcretePrototype1) obj.clone();

        assertEquals(obj.getId(), objClone.getId());
        assertEquals(obj.getName(), objClone.getName());

        assertNotEquals(obj.hashCode(), objClone.hashCode());
    }

    @Test
    public void comparePrototypeToOriginalObject2() {
        ConcretePrototype2 obj = new ConcretePrototype2(777, "Value 2");
        ConcretePrototype2 objClone = (ConcretePrototype2) obj.clone();

        assertEquals(obj.getKey(), objClone.getKey());
        assertEquals(obj.getValue(), objClone.getValue());

        assertNotEquals(obj.hashCode(), objClone.hashCode());
    }
}