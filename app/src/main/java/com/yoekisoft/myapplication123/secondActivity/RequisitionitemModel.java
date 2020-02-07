package com.yoekisoft.myapplication123.secondActivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequisitionitemModel {

    @SerializedName("ItemName")
    @Expose
    private String itemName;
    @SerializedName("ItemNo")
    @Expose
    private String itemNo;
    @SerializedName("RequestQty")
    @Expose
    private String requestQty;

    public RequisitionitemModel(String itemName, String itemNo, String requestQty) {
        this.itemName = itemName;
        this.itemNo = itemNo;
        this.requestQty = requestQty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getRequestQty() {
        return requestQty;
    }

    public void setRequestQty(String requestQty) {
        this.requestQty = requestQty;
    }

}