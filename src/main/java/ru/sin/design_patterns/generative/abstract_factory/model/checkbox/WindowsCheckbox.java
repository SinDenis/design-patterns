package ru.sin.design_patterns.generative.abstract_factory.model.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox");
    }
}
