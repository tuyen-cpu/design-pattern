package strategy;

public class CollectionB extends Collection{
  public CollectionB(int[] arr) {
    super(arr);
    setSortBehavior(new MergeSort());
  }
}
