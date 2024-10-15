class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia

    def ligar(self):
        print(f"O motor {self.tipo} de {self.potencia} está ligado.")

    def desligar(self):
        print(f"O motor {self.tipo} de {self.potencia} está desligado.")


class Pneu:
    def __init__(self, marca, tamanho):
        self.marca = marca
        self.tamanho = tamanho

    def inflar(self):
        print(f"O pneu {self.marca} de tamanho {self.tamanho} está inflado.")

    def desinflar(self):
        print(f"O pneu {self.marca} de tamanho {self.tamanho} está desinflado.")


class Carro:
    def __init__(self, modelo, motor, pneus):
        self.modelo = modelo
        self.motor = motor
        self.pneus = pneus

    def ligar(self):
        print(f"{self.modelo}:")
        self.motor.ligar()

    def desligar(self):
        print(f"{self.modelo}:")
        self.motor.desligar()

    def inflar_pneus(self):
        for pneu in self.pneus:
            pneu.inflar()

    def desinflar_pneus(self):
        for pneu in self.pneus:
            pneu.desinflar()


# Exemplo de uso:
motor = Motor(tipo="V8", potencia="450 cavalos")
pneus = [Pneu(marca="Michelin", tamanho="17"), Pneu(marca="Michelin", tamanho="17"),
         Pneu(marca="Michelin", tamanho="17"), Pneu(marca="Michelin", tamanho="17")]

carro = Carro(modelo="Mustang", motor=motor, pneus=pneus)

carro.ligar()
carro.inflar_pneus()
carro.desligar()
