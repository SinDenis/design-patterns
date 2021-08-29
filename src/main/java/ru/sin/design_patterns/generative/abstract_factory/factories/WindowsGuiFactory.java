package ru.sin.design_patterns.generative.abstract_factory.factories;

import ru.sin.design_patterns.generative.abstract_factory.model.button.Button;
import ru.sin.design_patterns.generative.abstract_factory.model.button.WindowsButton;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.Checkbox;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.WindowsCheckbox;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
