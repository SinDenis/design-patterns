package ru.sin.design_patterns.generative.abstract_factory.model.button;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac os button");
    }
}
