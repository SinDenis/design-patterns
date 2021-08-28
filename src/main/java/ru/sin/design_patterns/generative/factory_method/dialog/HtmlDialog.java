package ru.sin.design_patterns.generative.factory_method.dialog;

import ru.sin.design_patterns.generative.factory_method.button.Button;
import ru.sin.design_patterns.generative.factory_method.button.HtmlButton;
import ru.sin.design_patterns.generative.factory_method.dialog.AbstractDialog;

public class HtmlDialog extends AbstractDialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
