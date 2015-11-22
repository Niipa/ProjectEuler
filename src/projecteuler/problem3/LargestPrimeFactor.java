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

package projecteuler.problem3;

import java.util.Arrays;

/**
 * Assumptions
 */
public class LargestPrimeFactor {

  public long[] lngFactors;
  private int idxFactorsArr;


  public LargestPrimeFactor(long lngLargeNum){

    // Populate lngFactors.
    getPossiblePrimeFactors(lngLargeNum);

  }

  /**
   * Construct factors array. May allocate more memory than it needs.
   * Constructs an array of descending factors of the input number.
   * Skips all even numbers other than 2, as 2 is the only even prime.
   * @param lngLargeNum
   */
  public void getPossiblePrimeFactors(long lngLargeNum){

    this.lngFactors = new long[128];
    boolean full = false;
    this.idxFactorsArr = 0;

    for(long possibleFactor = lngLargeNum; possibleFactor > 0; possibleFactor -= 2){

      if(full) {
        this.lngFactors = Arrays.copyOf(this.lngFactors, this.lngFactors.length * 2);
        full = false;
      }

      if((lngLargeNum % possibleFactor) == 0){
        this.lngFactors[this.idxFactorsArr] = possibleFactor;
        ++this.idxFactorsArr;

        if(this.idxFactorsArr == this.lngFactors.length){
         full = true;
        }
      }
    }

    if(lngLargeNum % 2 == 0) {
      this.lngFactors[this.idxFactorsArr] = 2;
    }

    /**
     * If we want to recover memory, could write it here.
     */
}

  /**
   * Starting from the largest factor, do a primality test.
   * Should be okay with most numerical constraints on long.
   * @return
   */
  public long getLargestPrimeFactor(){

    /*
    for(int itr = 0; itr <= idxFactorsArr; ++itr){



    }
    */
    return 123;
  }


}
