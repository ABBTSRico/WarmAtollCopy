/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.abbts.swt.strategy;

import ch.abbts.swt.strategy.impl.BubbleSortStrategy;
import ch.abbts.swt.strategy.impl.InsertionSortStrategy;
import ch.abbts.swt.strategy.impl.NativeSortStrategy;

/**
* Dies ist ein Kommentar.
*/  
public class IntegerSortStrategyFactory {
  /**
  * Dies ist ein Kommentar.
  */    
  public IntegerSortStrategy createInstance(String factoryStr) {
    switch (factoryStr) {
      case "AUTO":
      case "BEST":
        return new NativeSortStrategy();
      case "INSERTION_SORT":
        return new InsertionSortStrategy();
      case "BUBBLE_SORT":
      default:
        return new BubbleSortStrategy();
    }
  }
}