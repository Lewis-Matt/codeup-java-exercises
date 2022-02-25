package movies;

// TODO: Give the user a list of options for viewing all the movies or viewing movies by category.
//  Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//  If a category is selected, only movies from that category should be displayed.
//  Your application should continue to run until the user chooses to exit.
//  Add functionality to allow a user to add a new movie to the list.

import util.Input;

public class MoviesApplication {
    // Inits an array of Movie type (separate class file) using findAll on an array of type Movie in the MoviesArray class
    public static Movie[] sortedMovies = MoviesArray.findAll();

    ///////////////////////////MAIN///////////////////////////
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        // Get user input
        Input userResponse = new Input();
        // Continue prompting until user enters 0 - exit
        while (userResponse.getInt() != 0) {
            // For loop example
            if (userResponse.getInt() == 1) {
                for (int i = 0; i < sortedMovies.length; i++) {
                    // sortedMovies is type Movie, which has a getName/getCategory method
                    System.out.printf("%s --- %s%n", sortedMovies[i].getName(), sortedMovies[i].getCategory());
                }
            } else if (userResponse.getInt() == 2) {
                // forEach loop
                for (Movie movie : sortedMovies) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.printf("%s --- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userResponse.getInt() == 3) {
                for (Movie movie : sortedMovies) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.printf("%s --- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userResponse.getInt() == 4) {
                for (Movie movie : sortedMovies) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.printf("%s --- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userResponse.getInt() == 5) {
                for (Movie movie : sortedMovies) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.printf("%s --- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("0 - exit, 1 - all , 2 - animated, 3 - drama, 4 - horror, 5 -scifi");
            System.out.println("Enter another choice [0 - 5]: ");
        }
        System.out.println("Exiting...");
    }
}
