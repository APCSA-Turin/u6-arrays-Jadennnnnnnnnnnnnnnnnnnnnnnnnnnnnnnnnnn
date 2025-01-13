import java.util.Arrays;
import java.util.Collections;

public class FlowerShop {
   private Flower[] flowerInventory;


   // ADDED TO ENABLE TESTING
   public FlowerShop(Flower[] flowerInventory) {
       this.flowerInventory = flowerInventory;
   }


   // ADDED TO ENABLE TESTING
   public Flower[] getFlowerInventory() {
       return flowerInventory;
   }


   // IMPLEMENTATION ADDED TO ENABLE TESTING
   public Flower[] sortByQuantity(Flower[] arr) {
       Flower[] sortedCopy = new Flower[arr.length];
       for (int i = 0; i < sortedCopy.length; i++) {
           sortedCopy[i]= arr[i];
       }
       Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
       Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
       return sortedCopy;
   }


   // part a
   public void updateInventory(Flower[] newInventory) {
       for (int i = 0; i < flowerInventory.length; i++) {
           Flower invFlower = flowerInventory[i];
           Flower newInvFlower = newInventory[i];
           int newQuantity = invFlower.getQuantity() + newInvFlower.getQuantity();
           invFlower.setQuantity(newQuantity);
       }
   }


   // part b
   public boolean topNSame(int n, Flower[] otherInventory) {
       Flower[] sortFlower = sortByQuantity(flowerInventory);
       Flower[] sortOther = sortByQuantity(otherInventory);
       for (int i = 0; i < n; i++) {
           String flowerName = sortFlower[i].getName();
           String otherName = sortOther[i].getName();
           if (!flowerName.equals(otherName)) {
               return false;
           }
       }
       return true;
   }

    public void updateInventory(Flower[] newInventory) {
        for (int i = 0; i < flowerInventory.length; i++) {
            Flower tFlower = flowerInventory[i];
            Flower iFlower = newinventory[i];
            int newQuantity = tFlower.getQuantity() + iFlower.getQuantity();
            tFlower.setQuantity(newQuantity);
        }
    }  

    public boolean topNSame(int n, Flower[] otherInventory) {
        Flower[] sorted1 = sortByQuantity(flowerInventory);
        Flower[] sorted2 = sortByQuantity(otherInventory);
        for (int i = 0; i < n; i++) {
            String name1 = sorted1[i].getName();
            String name2 = sorted2[i].getName();
            if(!name1.equals(name2)) {
                return false;
            }
        }
        return true;
    }
}

