package common_coupling;

public class Main {
    public static void main(String[] args) {
        CommonCouplingExample commonCouplingExample = new CommonCouplingExample(0);
        CommonCouplingA commonCouplingA = new CommonCouplingA(commonCouplingExample);
        CommonCouplingB commonCouplingB = new CommonCouplingB(commonCouplingExample);
        commonCouplingA.increase();
        System.out.println(commonCouplingA.getCommonCouplingExample().getCounter());
        commonCouplingB.increase();
        System.out.println(commonCouplingA.getCommonCouplingExample().getCounter());
    }
}

