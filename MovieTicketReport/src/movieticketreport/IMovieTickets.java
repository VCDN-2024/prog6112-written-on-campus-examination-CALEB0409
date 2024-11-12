/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieticketreport;

/**
 *
 * @author Roland
 */
public interface IMovieTickets 
{
    int calculateTotalSales(int[] monthlySales);
    String getTopPerformingMovie(String[] movieNames, int[] totalSales);
}
