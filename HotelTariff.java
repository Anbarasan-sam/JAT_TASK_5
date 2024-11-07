package guviTask5;

import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();        
        System.out.print("Enter the room rent per day: ");
        float rentPerDay = scanner.nextFloat();        
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();        
        float totalRent = rentPerDay * daysStayed;          
        switch(month) {
            case 4: // April
            case 5: // May
            case 6: // June
            case 11: // November
            case 12: // December
                totalRent *= 1.20; // Increase by 20% during peak season
                break;
            default:
                break; 
        }
        
        System.out.printf("%.2f\n", totalRent);
        
        scanner.close();
    }
}
