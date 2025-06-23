package abstractFactoryPattern.concreteproducts.light;

import abstractFactoryPattern.interfaces.Checkbox;

public class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Light Checkbox");
    }
}
