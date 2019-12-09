package com.youyuan.responsebilitychain;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—职责链模式
 * <p>
 * 校长
 * @date 2019/12/9 11:43
 */
public class SchoolMasterApprover extends Approver {
    /**
     * 审批开始金额
     */
    private float startPrice = 30000;
    /**
     * 审批结束金额
     */
    private float endPrice = 100000;

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurcheRequest purcheRequest) {
        if (purcheRequest.getPrice() > startPrice && purcheRequest.getPrice() <= endPrice) {
            System.out.println("执行采购步骤为 " + purcheRequest.getId() + " 执行人：" + getName());
        } else {
            this.getApprover().processRequest(purcheRequest);
        }
    }
}
