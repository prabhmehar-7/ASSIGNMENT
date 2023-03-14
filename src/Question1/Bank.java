package Question1;

abstract class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    //@Override
    public String toString() {
        return "Bank" + "name='" + name + ", headOfficeAddress='" + headOfficeAddress + ", chairmanName='" + chairmanName +
                ", branchCount=" + branchCount + ", fdInterestRate=" + fdInterestRate + ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate;
    }

    public static void main(String[] args) {
        Sbi sb = new Sbi("State Bank of India", "Bengalore", "JK", 100, 3, 4.6, 5.6);
        System.out.println(sb.getBranchCount());
        System.out.println(sb.getChairmanName());
        System.out.println(sb.getName());
        System.out.println(sb.toString());

        Icici ic = new Icici("ICICI" , "New Delhi","Rowling",3 ,4,6,8.6) ;
        System.out.println(ic.getBranchCount());
        System.out.println(ic.getChairmanName());
        System.out.println(ic.getName());
        System.out.println(ic.toString());

        Boi boi = new Boi("Boi" , "New Delhi","Tammy",9 ,5.7,6.3,8.6) ;
        System.out.println(boi.getBranchCount());
        System.out.println(boi.getChairmanName());
        System.out.println(boi.getName());
        System.out.println(boi.toString());
    }
}