package ru.sin.design_patterns.generative.abstract_factory.model.checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac os checkbox");
    }
}
