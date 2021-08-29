package ru.sin.design_patterns.generative.factory_method;

import ru.sin.design_patterns.generative.factory_method.factory.AndroidDialogFactory;
import ru.sin.design_patterns.generative.factory_method.factory.HtmlDialogFactory;

import java.util.Random;

public class DialogApplication {
    private static final String[] ENVIRONMENTS = new String[] {"android", "html"};

    public void renderWindow() {
        var environment = ENVIRONMENTS[new Random().nextInt(2)];
        var dialogFactory = switch (environment) {
            case "html" -> new HtmlDialogFactory();
            case "android" -> new AndroidDialogFactory();
            default -> throw new IllegalStateException("Unexpected value: " + environment);
        };
        var dialog = dialogFactory.createDialog();
        dialog.renderWindow();
    }
}
