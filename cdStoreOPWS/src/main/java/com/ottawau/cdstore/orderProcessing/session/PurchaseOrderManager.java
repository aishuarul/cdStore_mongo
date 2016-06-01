package com.ottawau.cdstore.orderProcessing.session;

import java.util.List;

import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;


public interface PurchaseOrderManager {

    public List<PurchaseOrder> findAllPurchaseOrder();

    public void saveNewPurchaseOrder(PurchaseOrder po);

}
