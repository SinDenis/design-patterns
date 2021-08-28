package ru.sin.design_patterns.generative.factory_method.factory;

import ru.sin.design_patterns.generative.factory_method.dialog.AbstractDialog;

public interface DialogFactory {
    AbstractDialog createDialog();
}
