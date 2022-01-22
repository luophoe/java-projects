/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8lab1library;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 2/7/2019
 * @author luophoe
 */
public class Unit8Lab1Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many books does your library have?");
        int numOfBooks=input.nextInt();
        String garbage = input.nextLine();

        Book[] myLibrary = new Book[numOfBooks];
        
        for(int x=0; x<myLibrary.length; x++){
            System.out.println("What is the title?");
            String title=input.nextLine();
            System.out.println("Who is the Author?");
            String author=input.nextLine();
            System.out.println("What is the Genre - Fiction or NonFiction?");
            String genre=input.nextLine();
            boolean onLoan=false;
            myLibrary[x]=new Book(title,author,genre,onLoan);
        }

        System.out.println("\nHow do you want to search?\n" + "1. By title\n" + 
                "2. By author\n" + "3. By genre\n" + "4. By loan status\n" + "5. Exit");
        int choice= 0;
        while (choice !=5){
            System.out.println("\nHow do you want to search?");
            choice = input.nextInt();
            garbage = input.nextLine();
            if(choice == 1){
                System.out.println("What is the title of the book?");
                String search=input.nextLine();
                for(int s=0; s<myLibrary.length;s++){
                    if(search.equals(myLibrary[s].getTitle())){
                        System.out.println(myLibrary[s]);
                    }
                }
            }else if(choice == 2){
                System.out.println("What is the author of the book?");
                String search=input.nextLine();
                for(int s=0; s<myLibrary.length;s++){
                    if(search.equals(myLibrary[s].getAuthor())){
                        System.out.println(myLibrary[s]);
                    }
                }
            }else if(choice == 3){
                System.out.println("What is the henre of the book?");
                String search=input.nextLine();
                for(int s=0; s<myLibrary.length;s++){
                    if(search.equals(myLibrary[s].getGenre())){
                        System.out.println(myLibrary[s]);
                    }
                }
            }else if(choice == 4){
                System.out.println("What is the status of the book?");
                boolean search=input.nextBoolean();
                for(int s=0; s<myLibrary.length;s++){
                    if(search==myLibrary[s].getOnloan()){
                        System.out.println(myLibrary[s]);
                    }
                }
            }
            
           
        }
        
       
        for(int s=0; s<myLibrary.length;s++){
            System.out.print("\nBook id: "+ s);
            System.out.println(myLibrary[s]);
        }   
        System.out.println("\nWhat book do you want to check out?"); 
        int book = input.nextInt();
        myLibrary[book].setOnloan();
        System.out.println(myLibrary[book]);
        
    } 
}
