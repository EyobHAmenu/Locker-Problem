import java.util.Arrays;

public class Locker {
    public static void main(String[] args) {
        // false is closed
        // true is open

        boolean locker [] = new boolean[100];

        for (int i = 0; i < locker.length; i++) {
            locker[i] = false; // array is initialized to false that means all lockers are locked.
        }

        for (int i = 1; i <= locker.length; i++) {
            for (int j = (i-1); j < locker.length; j += i) {
                if(locker[j] == true){
                    locker[j] = false;
                }else{
                    locker[j] = true;
                }
            }
        }
        for (int i = 0; i < locker.length; i++) {
            if(locker[i] == true){
                System.out.println("Locker number [" + (i+1) + "] is open.");
            }
        }








    }
}
