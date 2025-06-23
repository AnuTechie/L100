package abstractFactoryPattern.interfaces;

/** Abstract Factory: creates a family of widgets */
public interface GUIFactory {
    Button   createButton();
    Checkbox createCheckbox();
}
