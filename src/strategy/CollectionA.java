package strategy;

public class CollectionA extends Collection{
  public CollectionA(int[] arr) {
    super(arr);
    setSortBehavior(new QuickSort());
  }
}
