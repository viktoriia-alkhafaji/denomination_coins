package com.viktoriiaalkhafaji;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
    Integer [] coinDenominations = {20, 10, 5, 2, 1, 200, 100, 50};
    calcChange(9.39, "€", coinDenominations);
    }

    public static void calcChange (double amountOfMoneyDouble, String currency, Integer [] coins) {
        Integer amountOfMoney = (int)Math.round(amountOfMoneyDouble * 100);
        Arrays.sort(coins, Collections.reverseOrder());
        String answer = "";
        int amountOfDenomination = 0;

        for (int i = 0; i<coins.length; i++){
            amountOfDenomination = amountOfMoney / coins[i];
            if(amountOfDenomination != 0) {
                amountOfMoney = amountOfMoney % coins[i];
                answer += amountOfDenomination + "x" + (coins[i]*1.0)/100 + currency + "\n";
            }
        }
        System.out.println(answer);
    }
}
