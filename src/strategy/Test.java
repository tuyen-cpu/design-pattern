package strategy;

public class Test {
  public static void main(String[] args) {

    Collection collectionA = new CollectionA(new int[]{1,21,31,2,11});
    collectionA.performSort();
    collectionA.printArray();
    Collection collectionB = new CollectionB(new int[]{100,21,31,2,11});
    collectionB.performSort();
    collectionB.printArray();
  }
}
