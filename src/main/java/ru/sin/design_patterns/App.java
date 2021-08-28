package ru.sin.design_patterns;

import ru.sin.design_patterns.generative.factory_method.factory.AndroidDialogFactory;
import ru.sin.design_patterns.generative.factory_method.factory.HtmlDialogFactory;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        var environments = new String[] {"android", "html"};
        var environment = environments[new Random().nextInt(2)];
        var dialogFactory = switch (environment) {
            case "html" -> new HtmlDialogFactory();
            case "android" -> new AndroidDialogFactory();
            default -> throw new IllegalStateException("Unexpected value: " + environment);
        };
        var dialog = dialogFactory.createDialog();
        dialog.renderWindow();
    }

}
