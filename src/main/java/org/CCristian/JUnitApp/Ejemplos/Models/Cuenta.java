package org.CCristian.JUnitApp.Ejemplos.Models;

import org.CCristian.JUnitApp.Ejemplos.Exceptions.DineroInsuficiente_Exception;

import java.math.BigDecimal;

public class Cuenta {
/*---------------ATRIBUTOS---------------*/
    private String persona;
    private BigDecimal saldo;
    private Banco banco;
/*---------------GETTER-SETTER---------------*/
    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

/*---------------CONSTRUCTOR---------------*/
    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }
/*---------------MÉTODOS---------------*/
    public void debito(BigDecimal monto){
        BigDecimal nuevoSaldo = this.saldo.subtract(monto);
        if (nuevoSaldo.compareTo(BigDecimal.ZERO) < 0){
            throw new DineroInsuficiente_Exception("Dinero Insuficiente");
        }
        this.saldo = nuevoSaldo;
    }

    public void credito(BigDecimal monto){
        this.saldo = this.saldo.add(monto);
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cuenta)){  /*Valida que object sea instancia de 'Cuenta'*/
            return false;
        }
        Cuenta c = (Cuenta) obj;
        if (this.persona == null || this.saldo == null){    /*Valida que la cuenta que va a ser comparada no sea 'null'*/
            return false;
        }
        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
        /*Compara los valores de los atributos 'persona' y 'saldo'*/
    }
}
