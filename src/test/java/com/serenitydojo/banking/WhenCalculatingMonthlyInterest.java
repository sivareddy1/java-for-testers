package com.serenitydojo.banking;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WhenCalculatingMonthlyInterest {

    @Test
    public void shouldCalculateInterestForSavingsAccount(){

        //GIVEN
        SavingsAccount savingsAccount = new SavingsAccount(1200,0.01);
        //savingsAccount.setBalance(1200);
        //savingsAccount.setInterestRate(0.01);

        //WHEN
        double earnedInterest = savingsAccount.calculateMonthlyInterest();

        //THEN
        Assertions.assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test

    public void shouldCalculateInterestForBonds(){

        //GIVEN
        InterestYieldingBonds bonds = new InterestYieldingBonds(1200,0.01);

        //WHEN
        double earnedInterest = bonds.calculateMonthlyInterest();

        //THEN
        Assertions.assertThat(earnedInterest).isEqualTo(1.0);

    }

    @Test

    public void calculateInterestEarnedInPortfolio(){

        //GIVEN
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(1200,0.01));
        portfolio.add(new InterestYieldingBonds(1200.0,0.01));

        //WHEN
        double totalEarnedInterest = portfolio.calculateMonthlyInterest();

        //THEN
        Assertions.assertThat(totalEarnedInterest).isEqualTo(2.0);



    }


}
