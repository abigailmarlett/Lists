package assn2;

public class Main {
   public static void main (String[] args) {
      //List lst = new ArrayList(100);
      
      /*Sample code is provided below for you to examine for testing purposes. */
      List lst = new LinkedList();
      List alst = new ArrayList();

      Tester tst = new Tester();



      tst.ins(lst); // tester object runs test of the ins op
      tst.rem(lst); // etc.
      tst.get(lst);
      tst.find(lst);
      tst.isEmpty(lst);
      tst.size(lst);
      tst.clear(lst);
      tst.set(lst);
      tst.set(alst);
      tst.findLast(alst);
      tst.findLast(lst);
      tst.inSort(alst);
      tst.inSort(lst);
     // tst.bubbleIns(alst);
     // tst.bubbleIns(lst);
      tst.set(lst);

   }
}
