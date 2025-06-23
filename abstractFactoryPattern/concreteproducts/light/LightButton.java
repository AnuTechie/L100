package abstractFactoryPattern.concreteproducts.light;

import abstractFactoryPattern.interfaces.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }
}
