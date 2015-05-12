package me.ren.projecteuler.problem20;

/**
 * Created by N on 4/23/2015.
 */
import java.math.BigInteger;

public class FactorialDigitSum {

  public FactorialDigitSum(){}


  public long getSum(){

    BigInteger bigNum = new BigInteger("100");

    for(int itr = 99; itr > 1; --itr) {
      bigNum = bigNum.multiply(new BigInteger(String.valueOf(itr)));
    }

    String str =  bigNum.toString();
    long someSum = 0;
    for(char c: str.toCharArray()){
      someSum += (long)c;
    }

    someSum -= (str.length() * 48);

    return someSum;
  }

}
