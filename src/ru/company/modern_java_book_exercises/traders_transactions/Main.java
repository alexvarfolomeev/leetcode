package ru.company.modern_java_book_exercises.traders_transactions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> allTransactionsFor2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());
        System.out.println(allTransactionsFor2011);

        List<String>distinctCities = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctCities);

        List<Trader>traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(traders);

        List<Trader>allTradersSorted = transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(allTradersSorted);

        Boolean isMilanTraderExists = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(isMilanTraderExists);

        List<Integer>transactionsValues = transactions.stream()
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        System.out.println(transactionsValues);

        Integer maxTransactionValue = transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maxTransactionValue);

        Integer minTransactionValue = transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(minTransactionValue);



        
    }
}
