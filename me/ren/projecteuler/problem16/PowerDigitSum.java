package me.ren.projecteuler.problem16;

/**
 * Created by N on 4/25/2015.
 */

import java.math.BigInteger;

public class PowerDigitSum {

  public PowerDigitSum(){}

  public long getPowerDigitSum(){

    BigInteger bi = new BigInteger("2");
    BigInteger bi2 = new BigInteger("2");

    for(int itr = 1; itr < 1000; ++itr){
      bi = bi.multiply(bi2);
    }

    String str = bi.toString();
    System.out.println(str);
    long retVal = 0;

    for(char c: str.toCharArray()){
      retVal += (long)c;
    }

    retVal -= (str.length() * 48);

    return retVal;
  }
}
