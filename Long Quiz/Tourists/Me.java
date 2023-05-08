package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Feeling enjoy of staying!");
    }

    public void visit(Boracay boracay) {
        System.out.println("My budget is: " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Sawa na ako sa boracay pero g" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("awit bro i don't have budget pala");
        }

      checkBudget();
        
    }

    public void visit(Batanes Batanes) {

        if(budget >Batanes.airFare){
            System.out.println("Oh nice bro it's my first time in bohol!");
            budget -= Batanes.airFare;
        }else{
            System.out.println("Hindi pala swak budget ko bro");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Lezgo bro! I want to go Cebu");
            budget -= cebu.airFare;
        }else{
            System.out.println("Hindi pala swak budget ko bro");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Arat palawan bro!");
            budget -= palawan.airFare;
        }else{
            System.out.println("Hindi pala swak budget ko bro");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("Siargao rara na!");
            budget -= siargao.airFare;
        }else{
            System.out.println("Wala pa lang budget");
        }

        checkBudget();
    }

    public void visit(Samar samar) {
        if(budget >samar.airFare){
            System.out.println("Tara mag vigan!!! ");
            budget -= samar.airFare;
        }else{
            System.out.println("Wala pa lang budget");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is: "  + budget);
    }

    public static int getBudget() {
        return budget;
    }


}