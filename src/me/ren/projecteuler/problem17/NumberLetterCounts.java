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

package me.ren.projecteuler.problem17;

/**
 * Created by N on 5/3/2015.
 */
public class NumberLetterCounts {

  public NumberLetterCounts(){};

  public int getLetterCounts(){

    boolean blnSpecialCase1 = false;

    String nums[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten"," eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
      "eighteen", "nineteen"};

    String tens[] = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    int countOfLettersInNums[] = new int[nums.length];
    int countOfLettersInTens[] = new int[tens.length];

    // Initialize countOfLettersInNums;
    for(int itr = 0; itr < nums.length; ++itr){
      countOfLettersInNums[itr] = nums[itr].length();
    }
    // Initialize countOfLettersInTens;
    for(int itr = 0; itr < tens.length; ++itr){
      countOfLettersInTens[itr] = tens[itr].length();
    }

    // Include "one thousand", heuristic
    int cntLetters = 11;
    char chArr[];
    for(int itr = 1; itr < 1000; ++itr){

      chArr = String.valueOf(itr).toCharArray();
      int idxOnesDigit = chArr.length-1;

      if(chArr.length == 3){
        // Ex: If num is 345, we add 5 to the count of letters since there are 5 letters in "3"
        cntLetters += countOfLettersInNums[chArr[0]-'0'];
        // Hundred
        cntLetters += 7;
        // If the last two digits do not end in 0, add 3 to the count for the "and" word.
        if(!(chArr[1] == 0 && chArr[2] == 0)){
          cntLetters += 3;
        }
      }

      // After taking care of the hundreds place.
      if(chArr.length >= 2){

        int idxTensDigit = chArr.length-2;
        // Special case 1: 10-19 are in the nums array;
        if(chArr[idxTensDigit] == '1'){
          // Get the last two least significant digits and add them,
          // use the sum as the index to the cnt arrs.
          cntLetters += countOfLettersInNums[((chArr[idxTensDigit]-'0')+(chArr[idxOnesDigit]-'0'))-1];
          blnSpecialCase1 = true;
        }
        // Special case 2: Every single hundred, the last two digits end in "00"
        else if(!(chArr[idxTensDigit] == '0')){
          cntLetters += countOfLettersInTens[(chArr[idxTensDigit]-'0')-2];
        }
      }

      if(chArr[idxOnesDigit] != '0' && !blnSpecialCase1)
        cntLetters += countOfLettersInNums[chArr[idxOnesDigit]-'0'];

      blnSpecialCase1 = false;
    }

    return cntLetters;
  }
}
