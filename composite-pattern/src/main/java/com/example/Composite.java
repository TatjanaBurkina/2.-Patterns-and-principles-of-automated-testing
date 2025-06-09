package com.example;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void show() {
        System.out.println("Компонент: " + name);
        for (Component child : children) {
            child.show();
        }
    }
}
