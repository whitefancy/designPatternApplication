package designpattern.factorypattern.abstractfactorypattern;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return null;
    }
}
