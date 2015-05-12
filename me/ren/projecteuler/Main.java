package me.ren.projecteuler;

import me.ren.projecteuler.problem15.LatticePaths;

// Entry Point Class
public class Main {

  public static void main(String[] args) {
    LatticePaths lp = new LatticePaths();
    System.out.println(lp.getNumPaths(2));
  }

}
