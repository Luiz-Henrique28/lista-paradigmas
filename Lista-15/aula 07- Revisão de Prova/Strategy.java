// Interface para a estrategia de fabricacao de carros
interface CarManufacturingStrategy {
    void manufacture();
}

// Implementacoes especeficas de estrategias
class ElectricCarManufacturingStrategy implements CarManufacturingStrategy {
    @Override
    public void manufacture() {
        System.out.println("Fabricando um carro eletrico...");
    }
}

class GasolineCarManufacturingStrategy implements CarManufacturingStrategy {
    @Override
    public void manufacture() {
        System.out.println("Fabricando um carro a gasolina...");
    }
}

// Contexto da fabrica de carros
class CarFactory {
    private CarManufacturingStrategy strategy;

    public CarFactory(CarManufacturingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CarManufacturingStrategy strategy) {
        this.strategy = strategy;
    }

    public void produceCar() {
        strategy.manufacture();
    }
}

// Exemplo de uso
public class Strategy {
    public static void main(String[] args) {
        // Criacao das estrategias de fabricacao de carros
        CarManufacturingStrategy electricStrategy = new ElectricCarManufacturingStrategy();
        CarManufacturingStrategy gasolineStrategy = new GasolineCarManufacturingStrategy();

        // Criacao da fabrica de carros com uma estrategia padrao
        CarFactory factory = new CarFactory(electricStrategy);

        // Producao de um carro usando a estrategia atual
        factory.produceCar();

        // Mudanca da estrategia de fabricacao em tempo de execucao
        factory.setStrategy(gasolineStrategy);

        // Producao de outro carro usando a nova estrategia
        factory.produceCar();
    }
}