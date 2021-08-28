package ru.sin.design_patterns.generative.factory_method.factory;

import ru.sin.design_patterns.generative.factory_method.dialog.AbstractDialog;
import ru.sin.design_patterns.generative.factory_method.dialog.HtmlDialog;

public class HtmlDialogFactory implements DialogFactory {
    @Override
    public AbstractDialog createDialog() {
        return new HtmlDialog();
    }
}
