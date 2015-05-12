package me.ren.projecteuler.problem3;

/**
 * Created by N on 3/23/2015.
 */

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
