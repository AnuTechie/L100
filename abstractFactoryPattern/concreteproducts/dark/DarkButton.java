package abstractFactoryPattern.concreteproducts.dark;

import abstractFactoryPattern.interfaces.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}