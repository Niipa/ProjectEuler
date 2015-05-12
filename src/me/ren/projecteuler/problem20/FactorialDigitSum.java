/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Menard "Ren" Soliven
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package me.ren.projecteuler.problem20;

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
