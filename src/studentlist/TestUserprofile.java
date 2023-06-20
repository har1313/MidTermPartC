/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");
        System.out.println("5. Sci-Fi");

        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String favoriteGenre = getGenreFromChoice(genreChoice);

        UserProfile userProfile = new UserProfile(name, favoriteGenre);

        System.out.println("User profile created successfully!");
        System.out.println("Name: " + userProfile.getName());
        System.out.println("Favorite Genre: " + userProfile.getFavoriteGenre());
    }

    public static String getGenreFromChoice(int choice) {
        switch (choice) {
            case 1:
                return "Action";
            case 2:
                return "Comedy";
            case 3:
                return "Drama";
            case 4:
                return "Fantasy";
            case 5:
                return "Sci-Fi";
            default:
                return "Unknown";
        }
    }
}



