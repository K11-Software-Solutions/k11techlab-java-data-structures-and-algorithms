package com;


import java.util.Map;

public class AccountTransaction {

    public transient double initialBalance;
    public static double getFinalBalance(double initialBalance, Map<String, Double> userTransactions){

        for(int i=0; i<userTransactions.size(); i++ ){
            initialBalance= initialBalance+userTransactions.get(i);

        }
        return initialBalance;
    }

}
