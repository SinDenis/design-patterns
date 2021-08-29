package ru.sin.design_patterns.generative.abstract_factory.factories;

import ru.sin.design_patterns.generative.abstract_factory.model.button.Button;
import ru.sin.design_patterns.generative.abstract_factory.model.checkbox.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
