/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movieticketreport;

/**
 *
 * @author Roland
 */
public class MovieTicketReport {

   
    public static void main(String[] args) 
    {
         String[] movieNames = { "Napoleon", "Oppenheimer" };
        int[][] monthlySales = {
            { 3000, 1500, 1700 }, // Sales for Napoleon
            { 3500, 1200, 1600 }  // Sales for Oppenheimer
        };

        MovieTickets movieTickets = new MovieTickets(movieNames, monthlySales);
        movieTickets.displayReport();
    }
      
    }
    

