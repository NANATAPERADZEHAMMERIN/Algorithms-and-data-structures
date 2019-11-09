package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] argc){

        Movie [] movies = new Movie[4];

        movies[0] = new Movie(7, "Star Wars");
        movies[1] = new Movie (9, "Game of thrones");
        movies[2] = new Movie(10, "Sherlock");
        movies[3] = new Movie(6, "Dark");

        System.out.println("Before Sort : " + Arrays.toString(movies));

        Arrays.sort(movies);

        System.out.println("After Sort : " + Arrays.toString(movies));
    }

}
class Movie implements Comparable<Movie>{
    int rating = 0;
    String name;

    public Movie(int rating, String name){
        this.rating=rating;
        this.name = name;
    }

    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.rating, other.rating);
    }

    public String toString() {
        return "Movie: " + this.name + ", Rating: " + this.rating;
    }
}
