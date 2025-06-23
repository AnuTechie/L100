package abstractFactoryPattern.concreteproducts.dark;

import abstractFactoryPattern.interfaces.Checkbox;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Dark Checkbox");
    }
}
