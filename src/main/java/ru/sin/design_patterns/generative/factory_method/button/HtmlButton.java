package ru.sin.design_patterns.generative.factory_method.button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Render html button");
    }

    @Override
    public void onClick() {
        System.out.println("Click on html button");
    }
}
