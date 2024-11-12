/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketpricereport;

/**
 *
 * @author Roland
 */
//https://github.com/fb-shaik/PROG6112-Group3-2023/tree/main/Zoo_Application_Interface code was adapted from github 
interface ITicketSales {
   
double CalculateTotalCommission(String ticketPrice, String numberTickets);
boolean DataValidiation( String movieType, String ticketPrice, String numberTickets);

}

public class TicketSales implements ITicketSales
{
    @Override // methods hat calculates the amount of commission that will be charged 
    public double CalculateTotalCommission(String ticketPrice, String numberTickets) 
    {
     Double Price = Double.parseDouble(ticketPrice) ;
     Double AgentCommission = Double.parseDouble(numberTickets) ;
        return 0;
     
     
        
    }

    @Override//this method checks if all requirements are met when accepting users information 
    public boolean DataValidiation( String movieType, String ticketPrice, String numberTickets) 
    {
        // https://www.youtube.com/watch?v=-l1p55G4qGk code was adapted from this video 
        
        String movie = movieType ;
        Double price = Double.parseDouble(ticketPrice) ;
        Double commission = Double.parseDouble(numberTickets) ;
        
         if (movie.isEmpty()) 
         {//checks is the location field is empty 
            return false;
        }

      

        // Check if the property price is valid
        try {
          
            if (price <= 0) 
            {
                return false;// checks if the price of property is less than or equal to zero 
            }
        } 
        
        catch (Exception e) 
        {
            return false;
        }

        // Check if the commission percentage is less than or equal to zero 
        try 
        {
            
            if (commission <= 0) 
            {
                return false;
            }
        }
        
        catch (Exception e) 
        {
            return false;
        }

        
        return true;

    }
}
