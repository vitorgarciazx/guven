package src;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.UUID;

public class CriptoAssets {
    private UUID id;
    private String name;
    private String acronym;
    private BigDecimal presentValue;

    private HashMap<String, BigDecimal> currencyQuote = new HashMap<String, BigDecimal>();

    public void atualizarValor(){
        //Método para atualizar o valor da cripto
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }

    public BigDecimal getPresentValue() {
        return presentValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public void setPresentValue(BigDecimal presentValue) {
        this.presentValue = presentValue;
    }
}
