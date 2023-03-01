
public class Main {
    public static void main(String[] args) {
        sbiBank sbi = new sbiBank();
        sbi.bankDetails();
        sbi.sbiSetter("Model Town","Pranshu",12,8,5,6);
        sbi.bankGetter();

        boiBank boi = new boiBank();
        boi.bankDetails();
        boi.boiSetter("Ashok Vihar","Yaman",31,7.5,6,8);
        boi.bankGetter();

        iciciBank icici = new iciciBank();
        icici.bankDetails();
        icici.iciciSetter("Pitampura","Rocky",17,8.5,5.5,7);
        icici.bankGetter();
    }
}