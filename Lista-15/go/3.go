package main
import "fmt"

type ContaBancaria struct {
    Titular string
    Saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
    c.Saldo += valor
}

func (c *ContaBancaria) Sacar(valor float64) {
    if valor <= c.Saldo {
        c.Saldo -= valor
    } else {
        fmt.Println("Saldo insuficiente")
    }
}

func (c ContaBancaria) ExibirSaldo() string {
    return fmt.Sprintf("Saldo atual: R$%.2f", c.Saldo)
}

func main() {
    conta := ContaBancaria{Titular: "João", Saldo: 500}
    conta.Depositar(100)
    fmt.Println(conta.ExibirSaldo())
    conta.Sacar(200)
    fmt.Println(conta.ExibirSaldo())
}
