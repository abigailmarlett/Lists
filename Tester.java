package assn2;

public class Tester {


    public void bubbleIns(List ls){
        System.out.println("== Test of bubbleIns==========");
        ls.clear();
        ls.ins(0, 11.3); ls.ins(1, 45.1); ls.ins(2, -5.6); ls.ins(3, 17.3);
        System.out.println(ls);
        System.out.println(ls.bubbleIns(21));
        System.out.println(ls);
        System.out.println(ls.bubbleIns(-5.6));
        System.out.println(ls);
        System.out.println(ls.bubbleIns(45.1));
        System.out.println(ls);
    }


   public void set(List ls){
       System.out.println("== Test of set op ==========");
       ls.clear();
       System.out.println(ls.ins(0,10.0));
       System.out.println("list:"+ ls);
       ls.ins(0,11.1); ls.ins(1,12.2);
       System.out.println("list: " + ls);
       System.out.println(ls.set(2,111.1));
       System.out.println("list: " + ls);
       System.out.println(ls.set(1,2.1));
       System.out.println("list: " + ls);

       return;

   }
    public void inSort ( List ls ) {
        System.out.println("== Test of inSort ==========");
        ls.clear();
        ls.inSort(1.0);
        System.out.println("added one: " + ls);
        ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.2);
        System.out.println("List: " + ls);
        System.out.println("adding 5 "+ ls.inSort(5.0));
        System.out.println(ls);
        System.out.println("adding 86.5: " + ls.inSort(86.5));
        System.out.println(ls);
        System.out.println("adding 10.1: " + ls.inSort(10.1));
        System.out.println(ls);
        System.out.println("adding 12.9: " + ls.inSort(12.9));
        System.out.println(ls);
        System.out.println("adding 6.3: " + ls.inSort(6.3));
        System.out.println(ls);
        return;
    }

    public void findLast (List ls) {
        System.out.println("== Test of findNext =========");
        ls.clear();
        System.out.println("List: "+ ls);
        System.out.println(ls.findLast(12.2));
        ls.ins(0,11.1);
        System.out.println("List: "+ ls);
        System.out.println(ls.findLast(11.1));
        System.out.println(ls.findLast(12.2));
        ls.ins(0,22.2); ls.ins(1,33.3); ls.ins(0,44.4);
        System.out.println("List: "+ ls);
        System.out.println("33.3: " + ls.findLast(33.3));
        System.out.println("11.1: "+ ls.findLast(11.1));
        System.out.println("-5.5:"+ ls.findLast(-5.5));
        System.out.println("44.4:"+ ls.findLast(44.4));
        System.out.println("11.1:"+ ls.findLast(11.1));
        System.out.println("List:" + ls);
        return;
    }

   public void ins ( List ls ) {
      System.out.println("== Test of ins op ==========");
      ls.clear();
      System.out.println(ls.ins(0,10.0));
      System.out.println(ls);
      ls.ins(0,11.1); ls.ins(1,12.2);
      System.out.println(ls);
      System.out.println(ls.ins(14,111.1));
      System.out.println(ls.ins(3,101.01));
      System.out.println(ls); 
      return;
   }
   
   public void rem (List ls) {
     System.out.println("== Test of rem op ==========");
     ls.clear();
     System.out.println(ls.rem(0)); 
     System.out.println(ls);
     ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.3);
     System.out.println(ls);
     System.out.println(ls.rem(0));
     System.out.println(ls.rem(1));
     System.out.println(ls); 
     System.out.println(ls.size());
     ls.ins(0,14.4); ls.ins(1,17.7);
     System.out.println(ls);
     System.out.println(ls.rem(1));
     System.out.println(ls); 
     System.out.println(ls.rem(100));
     System.out.println(ls);
     return;
   }
   
   public void get (List ls) {
     System.out.println("== Test of get op ==========");
     ls.clear();
     System.out.println(ls.get(0)); 
     System.out.println(ls);
     ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.3);
     System.out.println(ls);
     System.out.println(ls.get(0));
     System.out.println(ls.get(1));
     System.out.println(ls.get(100));
     System.out.println(ls); 
     System.out.println(ls.size());
     ls.ins(0,14.4); ls.ins(1,17.7);
     System.out.println(ls);
     System.out.println(ls.get(1));
     System.out.println(ls); 
     System.out.println(ls.get(-100));
     System.out.println(ls);
     return;
   }
   
   public void find (List ls) {
     System.out.println("== Test of find op =========");
     ls.clear();
     System.out.println(ls.find(12.2));
     ls.ins(0,11.1);
     System.out.println(ls.find(11.1));
     System.out.println(ls.find(12.2));
     ls.ins(0,22.2); ls.ins(1,33.3); ls.ins(0,44.4);
     System.out.println(ls.find(33.3));
     System.out.println(ls.find(11.1));
     System.out.println(ls.find(-5.5));
     ls.clear();
     System.out.println(ls.find(11.1));
     return;
   }

   public void isEmpty (List ls) {
      System.out.println("== Test of isEmpty op =======");
      ls.clear();
      System.out.println(ls.isEmpty());
      ls.ins(0,1.1);
      System.out.println(ls.isEmpty());
      ls.ins(0,2.2);
      System.out.println(ls.isEmpty());
      ls.rem(0);
      System.out.println(ls.isEmpty());
      ls.rem(100);
      System.out.println(ls.isEmpty());
      ls.rem(0);
      System.out.println(ls.isEmpty());
      return;
   }
   
   public void contains(List ls) {
      System.out.println("== Test of contains op ======");
      ls.clear();
      return;
   }
   
   public void size (List ls) {
      System.out.println("== Test of size op ==========");
      ls.clear();
      System.out.println(ls.size());
      ls.ins(0,1.1); System.out.println(ls.size());
      ls.ins(0,2.2); System.out.println(ls.size());
      for (int i=2; i<20; i++) { ls.ins(i,i*1.1); }
      System.out.println(ls.size());
      for (int i=0; i<5; i++) { ls.rem(0); }
      System.out.println(ls.size());
      ls.clear();
      System.out.println(ls.size());
      return;
   }
   
   public void clear (List ls) {
      System.out.println("== Test of clear op =========");
      System.out.println(ls.size());
      double n = ls.get(0);
      System.out.println(ls.find(n));
      ls.clear();
      System.out.println(ls.size());
      System.out.println(ls.get(0));
      System.out.println(ls.get(100));
      System.out.println(ls.find(n));
      return;
   }

}


/*
    if (index<0 || index>=this.size) { return false; } // bad index
        if( isEmpty() ) { return false; } // empty list cant change anything
        // now here we have a non-empty list and a good index ... in range
        Node curr = this.head;
        Node prev = null;

        if (index == 0){
        Node newNode = new NodeImpl(element, curr.getNext());
        head = newNode;
        return true;
        }

        else{
        for (int i=0; i<index; i++) {
        if(i == size()-1) {
        Node newNode = new NodeImpl(element, null);
        tail.setValue(element);
        return true;
        }
        if (i == index){
        curr.setValue(element);
        Node newNode = new NodeImpl(element, curr.getNext());
        prev.getNext().setValue(element);
        return true;
        }
        prev=curr;  curr=curr.getNext();
        }
        // now curr points to the node to replace...
        // prev points to node before it

        return true;
        }
*/