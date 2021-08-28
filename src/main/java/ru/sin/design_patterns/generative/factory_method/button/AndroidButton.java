package ru.sin.design_patterns.generative.factory_method.button;

public class AndroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Render android button");
    }

    @Override
    public void onClick() {
        System.out.println("Click on android button");
    }
}
