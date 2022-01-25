/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosary;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 10/23/2018
 * @author luophoe
 */
public class Rosary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String hailmary = "Hail Mary:\n"
                + "Hail Mary full of Grace, the Lord is with thee.\n"
                + "Blessed are thou among women and blessed is the fruit of thy womb Jesus.\n"
                + "Holy Mary Mother of God,\n"
                + "pray for us sinners now and at the hour of our death\n"
                + "Amen.";
        String ourfather = "Our Father:\n"
                + "Our Father, Who art in heaven, hallowed be Thy name;\n"
                + "Thy kingdom come; Thy will be done on earth as it is in heaven.\n"
                + "Give us this day our daily bread; and forgive us our trespasses\n"
                + "as we forgive those who trespass against us;\n"
                + "and lead us not into temptation, but deliver us from evil, Amen.";
        String glorybe = "Glory Be:\n"
                + "Glory be to the Father, to the Son, and to the Holy Spirit, \n"
                + "as it was, is now, and ever shall be, world without end. Amen.";
        String apostlescreed = "Apostles’ Creed:\n"
                + "I believe in God, the Father Almighty, Creator of Heaven\n"
                + "and earth; and in Jesus Christ, His only Son, Our Lord, Who was conceived\n"
                + "by the Holy Ghost, born of the Virgin Mary, suffered under Pontius Pilate,\n"
                + "was crucified; died, and was buried. He descended into Hell; the third day\n"
                + "He arose again from the dead; He ascended into Heaven, sitteth at the\n"
                + "right hand of God, the Father Almighty; from thence He shall come to judge\n"
                + "the living and the dead. I believe in the Holy Spirit, the holy Catholic\n"
                + "Church, the communion of saints, the forgiveness of sins, the resurrection\n"
                + "of the body, and life everlasting. Amen.";
        
        System.out.println("(Hit enter every to continue rosary.)");
        input.nextLine();
        System.out.println(apostlescreed);
        input.nextLine();
        System.out.println(ourfather);
        for (int x = 1; x<= 3; x++){
            input.nextLine();
            System.out.println(hailmary);
        }
        input.nextLine();
        System.out.println(glorybe);
        
        
        
        for(int pray=1; pray<=5; pray ++){
            input.nextLine();
        System.out.println("The " + pray + " joyful mystery\n");
            input.nextLine();
            System.out.println(ourfather);    
            
            for (int y=1; y<=10; y++){
                input.nextLine();
                System.out.println(hailmary);
            } 
        input.nextLine();
        System.out.println(glorybe + "\n");
        
        } 
    }
}
