
package soru2bruteforce;

import java.util.Arrays;
import java.util.Random;
public class BruteForce {
    
    public static void main(String[] args) {
        int[] dizi = new int[1000]; 
        Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(100); 
        }
        System.out.println("Rastgele olusturulan dizi: " + Arrays.toString(dizi));

        bruteForce(dizi); 
        System.out.println("Rastgele olusturulmus dizinin siralanmis hali: " + Arrays.toString(dizi));
    }

    public static void bruteForce(int[] dizi) {
        for (int k = 0; k < dizi.length - 1; k++) {
            for (int m = k+ 1; m < dizi.length; m++) {
                if (dizi[k] > dizi[m]) { 
                    int temp = dizi[k];
                    dizi[k] = dizi[m];
                    dizi[m] = temp;
                }
            }
        }
    }
}

    
    
    
    
    
    

