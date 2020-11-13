import java.util.ArrayList;
import java.util.Scanner;

public class Shoes{

public static void main(String[] args) {
    ArrayList<String> shoes = new ArrayList<String>();
    ArrayList<Integer> price = new ArrayList<Integer>();
    getShoes(shoes);
    getPrice(shoes, price);
    display(shoes, price);

}

static void getShoes(ArrayList<String> shoes){
    Scanner myObj = new Scanner(System.in);

    System.out.println("Please enter your 3 favorite shoes: ");
    String shoe1 = myObj.nextLine();
    String shoe2 = myObj.nextLine();
    String shoe3 = myObj.nextLine();

    shoes.add(shoe1);
    shoes.add(shoe2);
    shoes.add(shoe3);
}

static void getPrice(ArrayList<String> shoes, ArrayList<Integer> price)
{
    for(int i = 0; i < shoes.size(); i++) 
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the price of " + shoes.get(i));
        price.add(myObj.nextInt());
    }
}

static void display(ArrayList<String> shoes, ArrayList<Integer> price){
    for(int i = 0; i < shoes.size(); i++) 
    {
        System.out.println("The price for " + shoes.get(i) + " is $" + price.get(i));
    }
    int total = 0;
    for(int i = 0; i < price.size(); i++)
    {
        total += price.get(i);
    }
    System.out.println("The total price of the shoes is $" + total);
}

}