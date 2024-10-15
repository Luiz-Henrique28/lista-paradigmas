class Singleton {
    // Instancia estatica da classe
    private static Singleton instance;

    // Construtor privado
    private Singleton() {
        System.out.println("Nova instÃ¢ncia criada.");
    }

    // Metodo publico para obter a instancia unica
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Exemplo de uso
public class Singleton_Padrao{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);  // True, ambas as instancias sao a mesma
    }
}