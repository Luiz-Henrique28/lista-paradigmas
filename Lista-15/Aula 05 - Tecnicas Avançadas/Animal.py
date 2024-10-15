class Animal:
    def __init__(self, especie, nome):
        self.especie = especie
        self.nome = nome 
        
    def emitir_som(self):
        pass  # método a ser implementado nas subclasses
    
    def exibir_info(self):
        return f"{self.nome} é um {self.especie} e faz {self.emitir_som()}"

class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__(especie="Cachorro", nome=nome)

    def emitir_som(self):
        return "Au Au"

class Gato(Animal):
    def __init__(self, nome):
        super().__init__(especie="Gato", nome=nome)

    def emitir_som(self):
        return "Miau"

def main():
    cachorro = Cachorro(nome="Kratos")
    gato = Gato(nome="Kaylla")

    print(cachorro.exibir_info())
    print(gato.exibir_info())

if __name__ == "__main__":
    main()
