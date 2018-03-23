package investments.fund;

public class Fund {
    private String name;
    private FundType fundType;

    public Fund(String name, FundType fundType) {
        this.name = name;
        this.fundType = fundType;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public FundType getFundType() {
        return fundType;
    }

    public void setFundType(FundType fundType) {
        this.fundType = fundType;
    }
}
