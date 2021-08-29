package ru.sin.design_patterns.generative.abstract_factory.factories;

import ru.sin.design_patterns.generative.abstract_factory.model.button.Button;
import ru.sin.design_patterns.generative.abstract_factory.model.button.LinuxButton;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.Checkbox;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.LinuxCheckbox;

public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
