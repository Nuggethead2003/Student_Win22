/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*edited by Amir
 */

package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");


        Card fiveClubs = new Card("Clbs",9);
     
        System.out.println(fiveClubs.getSuit()+ " " + fiveClubs.getValue());

        Card sixClubs = new Card("Clbs",6);

    }
}
