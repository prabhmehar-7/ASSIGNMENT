public class sbiBank extends Bank {
    nameOfBank b = nameOfBank.SBI;
    sbiBank() {}

    public void bankDetails(){
        System.out.println("Bank name: " + b);
    }
    public void sbiSetter(String headOfficeAddress,String chairmanName,int branchCount,double fdInterestRate,double personalLoanInterestRate,double homeLoanInterestRate){
        this.headOfficeAddress=headOfficeAddress;
        this.chairmanName=chairmanName;
        this.branchCount=branchCount;
        this.fdInterestRate=fdInterestRate;
        this.personalLoanInterestRate=personalLoanInterestRate;
        this.homeLoanInterestRate=homeLoanInterestRate;
    }
    public String toString(){
        return "Details entered: Bank - " +
                "HeadOfficeAddress='" + headOfficeAddress +
                ", ChairmanName='" + chairmanName +
                ", BranchCount=" + branchCount +
                ", FdInterestRate=" + fdInterestRate +
                ", PersonalLoanInterestRate=" + personalLoanInterestRate +
                ", HomeLoanInterestRate=" + homeLoanInterestRate;
    }
}