package me.ren.projecteuler.problem9;

/**
 * Created by N on 4/23/2015.
 */
public class SpecialPythagoreanTriplet {

  public SpecialPythagoreanTriplet(){
  }

  public double[] getVals(){

    double c;

    for(double a = 1; a < 1000; a++){
      for(double b = 1; b < 1000; b++){

        c = Math.sqrt((Math.pow(a,2) + (Math.pow(b,2))));

        if(c % 1 == 0) {

          if (a + b + c == 1000) {
            return new double[] {a, b, c};
          }

        }

      }
    }

    return null;

  }

}
