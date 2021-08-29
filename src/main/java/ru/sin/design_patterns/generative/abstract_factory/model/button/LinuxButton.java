package ru.sin.design_patterns.generative.abstract_factory.model.button;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux button");
    }
}
