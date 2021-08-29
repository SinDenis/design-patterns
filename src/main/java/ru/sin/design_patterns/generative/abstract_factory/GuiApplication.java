package ru.sin.design_patterns.generative.abstract_factory;

import ru.sin.design_patterns.generative.abstract_factory.factories.LinuxGuiFactory;
import ru.sin.design_patterns.generative.abstract_factory.factories.MacOsGuiFactory;
import ru.sin.design_patterns.generative.abstract_factory.factories.WindowsGuiFactory;

import java.util.Random;

public class GuiApplication {

    private static final String[] OS = new String[] {"linux", "windows", "macos"};

    public void paint() {
        var os = OS[new Random().nextInt(OS.length)];
        var guiFactory = switch (os) {
            case "linux" -> new LinuxGuiFactory();
            case "windows" -> new WindowsGuiFactory();
            case "macos" -> new MacOsGuiFactory();
            default -> throw new IllegalArgumentException();
        };
        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }

}
