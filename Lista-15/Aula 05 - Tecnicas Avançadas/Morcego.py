class Animal:
    def __init__(self, nome):
        self.nome = nome

    def emitir_som(self):
        pass  # Método a ser implementado nas subclasses

class Mamifero(Animal):
    def __init__(self, nome):
        super().__init__(nome)

    def amamentar(self):
        print(f"{self.nome} está amamentando.")

class Ave(Animal):
    def __init__(self, nome):
        super().__init__(nome)

    def voar(self):
        print(f"{self.nome} está voando.")

class Morcego(Mamifero, Ave):
    def __init__(self, nome):
        super().__init__(nome)

    def emitir_som(self):
        print("Morcego fazendo ruídos noturnos.")

# Exemplo de Uso
morcego = Morcego("Batemane")
morcego.emitir_som()  # Método da Classe Morcego
morcego.amamentar()   # Método da Classe Mamifero
morcego.voar()        # Método da Classe Ave
