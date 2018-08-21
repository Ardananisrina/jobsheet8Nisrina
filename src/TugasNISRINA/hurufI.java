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
public class hurufI {
    public static void main(String[] args) {
       int i, j;
       
       for(i = 1; i <= 11; i++){
           for(j = 1; j <= 8; j++){
               if(i == 11 || i == 1 || j == 5 || j == 0){
                   System.out.print("#");
               }
               else
                   System.out.print(" ");
           }
               System.out.println();
       }
    }
}