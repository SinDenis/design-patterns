package ru.sin.design_patterns.generative.factory_method.dialog;

import ru.sin.design_patterns.generative.factory_method.button.AndroidButton;
import ru.sin.design_patterns.generative.factory_method.button.Button;
import ru.sin.design_patterns.generative.factory_method.dialog.AbstractDialog;

public class AndroidDialog extends AbstractDialog {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
