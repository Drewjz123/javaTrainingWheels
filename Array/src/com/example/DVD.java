package com.example;


public class DVD {
    DVD[] dvdCollection = new DVD[15];
    public String name;
    public String director;
    public int release_year;

    public DVD(String name, String director, int release_year){

        this.name = name;
        this.director= director;
        this.release_year = release_year;


    }

    public String toString(){

      System.out.println("Title: "+ this.name + "The director: " + this.director +" The release year: " + this.release_year);
      return null;


    }
}
