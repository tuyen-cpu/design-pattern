package strategy;

public abstract class Collection {
SortBehavior sortBehavior;
int[] arr;
public Collection(int[] arr){
this.arr =arr;
}
public void setSortBehavior(SortBehavior sortBehavior){
  this.sortBehavior = sortBehavior;
}
  public void performSort() {
    sortBehavior.sort(this.arr,0,this.arr.length-1);
  }
  void printArray() {
    int n = this.arr.length;
    for (int j : this.arr) System.out.print(j + " ");
    System.out.println();
  }
}
