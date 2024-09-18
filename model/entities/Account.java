package model.entities;

import model.exceptions.AccountException;

public class Account {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Account(){

    }

    public Account(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) throws AccountException {
        if(valor > limiteDeSaque) {
            throw new AccountException("Valor superior ao limite de saque");
        }
        if(valor > saldo){
            throw new AccountException("Valor superior ao saldo");
        }
        else{
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "conta " + numero + ", titular " + titular + ", saldo R$" + saldo;
    }
}
