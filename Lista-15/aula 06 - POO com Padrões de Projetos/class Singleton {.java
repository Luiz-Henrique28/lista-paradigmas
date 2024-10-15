class Singleton {
    private static Singleton instance;

    // Construtor privado para impedir multiplas instancias
    private Singleton() {
        System.out.println("Criando a nova instÃ¢ncia Singleton.");
    }

   
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Exemplo de uso
public class Padrao_Singleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);  // True, pois ambas as instancias sao iguais
    }
}
