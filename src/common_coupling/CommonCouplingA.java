package common_coupling;

public class CommonCouplingA {
    private CommonCouplingExample commonCouplingExample;

    public CommonCouplingA(CommonCouplingExample commonCouplingExample) {
        this.commonCouplingExample = commonCouplingExample;
    }

    public void increase() {
        this.commonCouplingExample.setCounter(this.commonCouplingExample.getCounter() + 1);
    }

    public CommonCouplingExample getCommonCouplingExample() {
        return commonCouplingExample;
    }

    public void setCommonCouplingExample(CommonCouplingExample commonCouplingExample) {
        this.commonCouplingExample = commonCouplingExample;
    }
}
