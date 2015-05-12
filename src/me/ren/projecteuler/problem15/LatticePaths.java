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

package me.ren.projecteuler.problem15;

public class LatticePaths {

  private long countOfPaths;
  private int heuristic;
  public LatticePaths(){};

  public long getNumPaths(int gridSize){
    this.countOfPaths = 0;
    heuristic = gridSize;
    cntRoutes(gridSize, gridSize);
    return this.countOfPaths*2;
  }

  // Slow. Way too slow. For a 20x20 grid.
  public void cntRoutes(int x, int y){

    if(x == 0 && y == 0){
      ++countOfPaths;
    }else if(x == 0 && y > 0){
      cntRoutes(x, --y);
    }else if(y == 0 && x > 0){
      cntRoutes(--x, y);
    }else{
      cntRoutes(x, --y);
      ++y;
      // Heuristic, only need to calculate for half of the paths and times that by 2.
      if(x == heuristic && y == heuristic) {
        return;
      }
      cntRoutes(--x,y);
    }
  }

  // TODO
  public void cntRoutes(int n){

    /*
     * Bit String of 2n elements. Let 0 represent down and 1 represent right.
     * We start with 000...000
     * If we want to go right on the first try we keep 0
     */
    boolean[] blnPaths = new boolean[2*n];



  }
}
