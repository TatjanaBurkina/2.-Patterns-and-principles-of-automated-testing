package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompositeTest {
    @Test
    public void testCompositeStructure() {
        Composite root = new Composite("Корень");
        Leaf leaf1 = new Leaf("Лист 1");
        Leaf leaf2 = new Leaf("Лист 2");
        
        root.add(leaf1);
        root.add(leaf2);
        
        assertEquals(2, root.getChildren().size());
    }
}
