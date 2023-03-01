abstract class Bank {

    enum nameOfBank{SBI,BOI,ICICI};

    protected String headOfficeAddress, chairmanName;
    int branchCount;
    double fdInterestRate,personalLoanInterestRate,homeLoanInterestRate;
    public void bankGetter(){
        System.out.println("Details entered of bank: "+
                "HeadOfficeAddress='" + headOfficeAddress +
                ", ChairmanName='" + chairmanName +
                ", BranchCount=" + branchCount +
                ", FdInterestRate=" + fdInterestRate +
                ", PersonalLoanInterestRate=" + personalLoanInterestRate +
                ", HomeLoanInterestRate=" + homeLoanInterestRate);
    }
    @Override
    public String toString() {
        return "Details entered: Bank - " +
                "HeadOfficeAddress='" + headOfficeAddress +
                ", ChairmanName='" + chairmanName +
                ", BranchCount=" + branchCount +
                ", FdInterestRate=" + fdInterestRate +
                ", PersonalLoanInterestRate=" + personalLoanInterestRate +
                ", HomeLoanInterestRate=" + homeLoanInterestRate;
    }
}