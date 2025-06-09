package com.example;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Лист: " + name);
    }
}
