package me.ren.projecteuler.problem15;

/**
 * Created by N on 4/25/2015.
 */
public class LatticePaths {

  private int countOfPaths;
  public LatticePaths(){};

  public int getNumPaths(int gridSize){
    this.countOfPaths = 0;
    cntRoutes(gridSize, gridSize);
    return this.countOfPaths;
  }

  public void cntRoutes(int x, int y){
    if(x == 0 && y == 0){
      ++countOfPaths;
    }else if(x == 0 && y > 0){
      cntRoutes(x, --y);
    }else if(y == 0 && x > 0){
      cntRoutes(--x, y);
    }else{
      cntRoutes(x, --y);
      cntRoutes(--x,y);
    }
  }
}
