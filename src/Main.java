
class BalanceAmount{
    int Balance;
    public void setBalance(int Amount){
        Balance =Amount;
    }
    public void IncrementBalance(){
        Balance+=10;
    }
    public int GetCurrentBalance(){
        return Balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BalanceAmount obj = new BalanceAmount();
        obj.setBalance(20);
        obj.IncrementBalance();
        System.out.println(obj.GetCurrentBalance());
        obj.Balance=1000;
        System.out.println(obj.GetCurrentBalance());
    }
}