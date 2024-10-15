class Calculadora:
    def somar(self, *args):
        return sum(args)

# Exemplo de uso
calc = Calculadora()
print(calc.somar(2, 3))         # Saída: 5
print(calc.somar(2, 3, 4))      # Saída: 9
