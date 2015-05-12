package me.ren.projecteuler.problem12;

/**
 * Created by N on 4/23/2015.
 */
public class HighlyDivisibleTriangularNumber {

  public HighlyDivisibleTriangularNumber(){}

  public int getDivisibleNum(){

    int TriangleNum = 1;
    for(int i=2; i<=Integer.MAX_VALUE; i++){

      TriangleNum += i;
      int c = cntDivisible(TriangleNum);
      if(c >=500 ) {
        System.out.println(c);
        return TriangleNum;
      }
    }

    return 0;
  }

  public int cntDivisible(int triNum){
    int cnt = 1;
    for(int i = 2; i*i<=triNum; i++){
      if(triNum % i == 0) cnt+=2;
    }
    return cnt;
  }

}
