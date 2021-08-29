package ru.sin.design_patterns.generative.abstract_factory.factories;

import ru.sin.design_patterns.generative.abstract_factory.model.button.Button;
import ru.sin.design_patterns.generative.abstract_factory.model.button.MacOsButton;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.Checkbox;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.MacOsCheckbox;

public class MacOsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
