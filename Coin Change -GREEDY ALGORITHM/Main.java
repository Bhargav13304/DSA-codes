import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,500,1000};
        int amount = 2035;
        System.out.println("Coins Available :"+Arrays.toString(coins));
        System.out.println("Amount to be paid :"+amount);
        CoinChangeProblem.coinChangeProblem(coins, amount);
        
    }



}

