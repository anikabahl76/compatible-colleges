/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1022990
 */
public class College {
    private String name;
    private double grantMoney;
    private double loanMoney;
    private double workstudyMoney;
    private double loanInterestRate;
    public FinancialFactor ROI;
    public FinancialFactor loanPayoffPeriod;
    public FinancialFactor upfrontCost;
    public FinancialFactor midCareerSalary;
    public FinancialFactor earlyCareerSalary;
    private double financialBenefitIndex;
    
    College(){
       
    }
    
    public String getName(){
        return name;
    }

    public double getGrantMoney() {
        return grantMoney;
    }

    public double getLoanMoney() {
        return loanMoney;
    }

    public double getWorkstudyMoney() {
        return workstudyMoney;
    }

    public double getLoanInterestRate() {
        return loanInterestRate;
    }
    
    public double getFinancialBenefitIndex() {
        return financialBenefitIndex;
    }

    public FinancialFactor getROI() {
        return ROI;
    }

    public FinancialFactor getLoanPayoffPeriod() {
        return loanPayoffPeriod;
    }

    public FinancialFactor getUpfrontCost() {
        return upfrontCost;
    }

    
    public FinancialFactor getMidCareerSalary() {
        return midCareerSalary;
    }

    public FinancialFactor getEarlyCareerSalary() {
        return earlyCareerSalary;
    }

    public FinancialFactor[] getFinancialFactors() {
        FinancialFactor[] FinancialFactors = {ROI,loanPayoffPeriod, upfrontCost,midCareerSalary,earlyCareerSalary};
        return FinancialFactors;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
            

    public void setGrantMoney(double grantMoney) {
        this.grantMoney = grantMoney;
    }

    public void setLoanMoney(double loanMoney) {
        this.loanMoney = loanMoney;
    }

    public void setWorkstudyMoney(double workstudyMoney) {
        this.workstudyMoney = workstudyMoney;
    }
    
    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public void setFinancialBenefitIndex(double financialBenefitIndex) {
        this.financialBenefitIndex = financialBenefitIndex;
    }
    
    public double calculateFinancialBenefitIndex()
    {
        return ROI.weight*ROI.relative+loanPayoffPeriod.weight*loanPayoffPeriod.relative+upfrontCost.weight*upfrontCost.relative+midCareerSalary.weight*midCareerSalary.relative+earlyCareerSalary.weight*earlyCareerSalary.relative;
    }
    
    public void sortFinancialFactors(FinancialFactor[] f)
    {
        int end = 1;
        for (int i=0;i<f.length;i++)
        {
          for (int j=0;j<f.length-end;j++)
          {
            if (f[j].getRelative() > f[j+1].getRelative())
            {
              FinancialFactor temp = f[j];
              f[j] = f[j+1];
              f[j+1] = temp;
            }
          }
          end++;
        }
    }
    
    public FinancialFactor findBestFactor(FinancialFactor[] f)
    {
        sortFinancialFactors(f);
        return f[f.length-1];
    }
    
    public FinancialFactor findWorstFactor(FinancialFactor[] f)
    {
        sortFinancialFactors(f);
        return f[0];
    }    
    
}
