package Newyear;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);

        int lowerlimit;
        int higherlimlit;

        System.out.println("Enter LowerLimit of gift");
        lowerlimit = s.nextInt();
        System.out.println("Enter Highest limit of gift");
        higherlimlit = s.nextInt();

        Student student1 = new Student();
        Chocolate D = new Chocolate();
        OtherSweets O = new OtherSweets();
        D.Cname = "Dairy Milk ";
        O.name = "Rasgulla ";
        System.out.println("Enter Cost of Chocolate");
        D.cost = s.nextInt();
        System.out.println("Enter Cost of Other Sweets");
        O.cost = s.nextInt();
        student1.name = "Student1 ";
        D.weight = 30;
        O.weight = 500;
        int cost = D.getCost() + O.getCost();
        System.out.println(student1.name);
        if(cost > lowerlimit && cost < higherlimlit){
            System.out.println("Total cost of gift");
            System.out.println("Rs" + cost);
        }
        else if(cost < lowerlimit){
            System.out.println("Plz enter Some more Chocolates to the gift ");
        }
        else if(cost > higherlimlit){
            System.out.println("PLz remove some of the sweets");
        }
        System.out.println("Total weight");
        System.out.println(D.getWeight() + O.getWeight() + " Which includes " + D.Cname + "And " + O.name);
        System.out.println("\n");

        Student student2 = new Student();
        Chocolate a = new Chocolate();
        OtherSweets ob = new OtherSweets();
        a.Cname = "Milky bar ";
        ob.name = "RasMalai";
        a.weight = 50;
        ob.weight = 800;
        System.out.println("Enter Cost of Chocolate");
        a.cost = s.nextInt();
        System.out.println("Enter cost of Other Sweets");
        ob.cost = s.nextInt();
        student2.name = "Student 2 ";
        System.out.println(student2.name);
        int Cost = a.getCost() + ob.getCost();
        if(Cost > lowerlimit && Cost < higherlimlit){
            System.out.println("Total Cost ");
            System.out.println("Rs" + Cost);
        }
        else if(cost < lowerlimit){
            System.out.println("Plz enter Some more Chocolates to the gift ");
        }
        else if(cost > higherlimlit){
            System.out.println("PLz remove some of the sweets");
        }
        System.out.println("Total weight");
        System.out.println(a.getWeight() + ob.getWeight() + " Which includes " + a.Cname + "And " + ob.name);


    }
}
