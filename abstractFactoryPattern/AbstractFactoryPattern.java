package abstractFactoryPattern;

import abstractFactoryPattern.concreteproducts.dark.DarkThemeFactory;
import abstractFactoryPattern.concreteproducts.light.LightThemeFactory;
import abstractFactoryPattern.interfaces.*;

public class AbstractFactoryPattern {

    public static void main(String[] args) {

        // -------- Light theme --------
        GUIFactory lightFactory = new LightThemeFactory();
        Button   lightButton   = lightFactory.createButton();
        Checkbox lightCheckbox = lightFactory.createCheckbox();
        lightButton.render();
        lightCheckbox.render();

        // -------- Dark theme --------
        GUIFactory darkFactory = new DarkThemeFactory();
        Button   darkButton   = darkFactory.createButton();
        Checkbox darkCheckbox = darkFactory.createCheckbox();
        darkButton.render();
        darkCheckbox.render();
    }
}
