package ru.sin.design_patterns.generative.abstract_factory.model.checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Linux checkbox");
    }
}
