// Subsistema para fazer cafÃ©
class Cafeteira {
    public void moerGraos() {
        System.out.println("Moendo grÃ£os de cafÃ©");
    }

    public void fazerCafe() {
        System.out.println("Fazendo cafÃ©");
    }
}

// Subsistema para fazer chÃ¡
class Chaleira {
    public void ferverAgua() {
        System.out.println("Fervendo Ã¡gua");
    }

    public void fazerCha() {
        System.out.println("Fazendo chÃ¡");
    }
}

// Fachada
class BebidasFacade {
    private Cafeteira cafeteira;
    private Chaleira chaleira;

    public BebidasFacade() {
        this.cafeteira = new Cafeteira();
        this.chaleira = new Chaleira();
    }

    public void prepararCafe() {
        System.out.println("\nPreparando cafÃ©...");
        cafeteira.moerGraos();
        cafeteira.fazerCafe();
    }

    public void prepararCha() {
        System.out.println("\nPreparando chÃ¡...");
        chaleira.ferverAgua();
        chaleira.fazerCha();
    }
}

// Cliente
public class Padrao_facade {
    public static void main(String[] args) {
        BebidasFacade facade = new BebidasFacade();
        facade.prepararCafe();
        facade.prepararCha();
    }
}
