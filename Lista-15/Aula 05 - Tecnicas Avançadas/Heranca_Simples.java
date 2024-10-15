class Animal {
    protected String especie;
    protected String nome;

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    public String emitirSom() {
        return "";
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super("Cachorro", nome);
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super("Gato", nome);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}

public class Heranca_Simples {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mingau");

        System.out.println(cachorro.nome + " diz: " + cachorro.emitirSom());
        System.out.println(gato.nome + " diz: " + gato.emitirSom());
    }
}
