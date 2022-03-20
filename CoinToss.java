import java.util.Random;

public class CoinToss {

    public String tossACoin() {
        Random random = new Random();
        boolean toss = random.nextBoolean();
        if(toss == true){
            return "HEADS";
        }
        else{
            return "TAILS"; 
        }
    }

   public static void main(String[] args) {
       CoinToss game = new CoinToss();
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
   } 
}
