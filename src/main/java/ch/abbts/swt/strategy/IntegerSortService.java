package ch.abbts.swt.strategy;

public class IntegerSortService {

  /**
  * Dies ist ein Kommentar.
  */    
  public void setNumberSortStrategy(IntegerSortStrategy numberSortStrategy) {
    this.numberSortStrategy = numberSortStrategy;
  }

  private IntegerSortStrategy numberSortStrategy;

  /**
  * Dies ist ein Kommentar.
  */  
  public Integer[] sort(Integer[] toSort) {
    return numberSortStrategy.sort(toSort);
  }
}
