/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8lab1library;

/**
 *
 * @author luophoe
 */
public class Book {
    String title;
    String author;
    String genre;
    boolean onLoan;
    
    public Book(String t, String a, String g, boolean o){
	title = t;
	author = a;
	genre = g;
        onLoan = o;
    }
    
    public String getTitle(){
       return title;
    }
    
    public String getAuthor(){
       return author;
    }
    
    public String getGenre(){
       return genre;
    }
    
    public boolean getOnloan(){
        return onLoan;
    }
    
    public void setOnloan(){
        onLoan = true;
        System.out.println("\nThe book is out now: " + onLoan);
    }
    
    public String toString(){
        return "\nTitle: " + title + "\tAuthor: " + author + "\tGenre: " + genre + "\tChecked in: " + onLoan;
    }

}
