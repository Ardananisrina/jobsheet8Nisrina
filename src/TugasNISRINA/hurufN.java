/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNISRINA;

/**
 *
 * @author Nisrina Izdihar
 */
public class hurufN {
    public static void main(String[] args){
        int i, j, k, l;
        for(i = 0; i <= 11; i++){
            for(j = 0; j <= 2; j++){
                System.out.print("#");
            }
            for(k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for(j = 0; j <= 2; j++){
                System.out.print("#");
            }
            for(l = 10; l>= i; l--){
                System.out.print(" ");
            }
            for(j = 0; j <= 2; j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
    
}
