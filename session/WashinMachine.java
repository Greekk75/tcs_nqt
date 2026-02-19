package session;

public class WashinMachine {
    public static void calTime(int wt){
            if(wt == 0){
                System.out.println("Time Estimated: 0");
            }
            else if(wt >0 && wt <=2000){
                System.out.println("Time Estimated: 25");
            }
            else if(wt >2000 && wt <=4000){
                System.out.println("Time Estimated: 35");
            }
            else if(wt > 4000 && wt<= 7000){
                System.out.println("Time Estimated: 45");
            }
            else{
                System.out.println("INVALID INPUT");
            }

    }
}
