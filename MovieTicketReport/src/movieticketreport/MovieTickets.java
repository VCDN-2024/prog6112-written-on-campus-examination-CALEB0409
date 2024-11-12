/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketreport;

/**
 *
 * @author Roland
 */
public class MovieTickets implements IMovieTickets
{
    private String[] movieNames;
    private int[][] monthlySales;

    public MovieTickets(String[] movieNames, int[][] monthlySales) {
        this.movieNames = movieNames;
        this.monthlySales = monthlySales;
    }

    @Override
    public int calculateTotalSales(int[] monthlySales) {
        int total = 0;
        for (int sales : monthlySales) {
            total += sales;
        }
        return total;
    }

    @Override
    public String getTopPerformingMovie(String[] movieNames, int[] totalSales) {
        int maxSales = totalSales[0];
        int topMovieIndex = 0;
        
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovieIndex = i;
            }
        }
        
        return movieNames[topMovieIndex];
    }

    public void displayReport() {
        int[] totalSalesPerMovie = new int[movieNames.length];
        
        System.out.println("Movie Sales Report - 2024:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie: " + movieNames[i]);
            System.out.println("January: $" + monthlySales[i][0]);
            System.out.println("February: $" + monthlySales[i][1]);
            System.out.println("March: $" + monthlySales[i][2]);

            totalSalesPerMovie[i] = calculateTotalSales(monthlySales[i]);
            System.out.println("Total Sales: $" + totalSalesPerMovie[i] + "\n");
        }

        String topMovie = getTopPerformingMovie(movieNames, totalSalesPerMovie);
        System.out.println("Top Performing Movie: " + topMovie);
    }
}
