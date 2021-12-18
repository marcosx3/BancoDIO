package cliente;

import banco.Banco;

public class Cliente implements Banco {
    private String nome;
    private String Sobrenome;
    private Double saldo = 0.0;

    public Cliente() { }

    public Cliente(String nome, String sobrenome, Double saldo) {
        this.nome = nome;
        Sobrenome = sobrenome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Sobrenome='" + Sobrenome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
