package com.frwk.salesforce.integrator.dto;

import lombok.Getter;

@Getter
public enum TransactionType {
    CREATE("C"),
    UPDATE("U"),
    DELETE("D");

    public String prefix;

    TransactionType(String prefix){this.prefix=prefix;}

    public static TransactionType lookup(String prefix) {
        for(TransactionType tt :TransactionType.values()){
            if(tt.getPrefix().equals(prefix.toUpperCase())) {
                return tt;
            }
        }
        return null;
    }
}
