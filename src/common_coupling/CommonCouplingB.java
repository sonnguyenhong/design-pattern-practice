package common_coupling;

public class CommonCouplingB {
    private CommonCouplingExample commonCouplingExample;

    public CommonCouplingB(CommonCouplingExample commonCouplingExample) {
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
