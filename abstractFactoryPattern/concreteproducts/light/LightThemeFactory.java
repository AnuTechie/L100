package abstractFactoryPattern.concreteproducts.light;

import abstractFactoryPattern.interfaces.*;

/** Concrete Factory for the Light theme */
public class LightThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
