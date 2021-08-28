package ru.sin.design_patterns.generative.factory_method.dialog;

import ru.sin.design_patterns.generative.factory_method.button.Button;
import ru.sin.design_patterns.generative.factory_method.factory.ButtonFactory;

public abstract class AbstractDialog implements ButtonFactory {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }

    @Override
    public abstract Button createButton();
}
