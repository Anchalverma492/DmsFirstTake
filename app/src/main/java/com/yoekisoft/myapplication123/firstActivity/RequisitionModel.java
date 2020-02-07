package com.yoekisoft.myapplication123.firstActivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequisitionModel {

    @SerializedName("RequestNo")
    @Expose
    private String requestNo;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("ItemsCount")
    @Expose
    private String ItemsCount;

    public RequisitionModel(String requestNo, String date, String createdBy, String status, String itemsCount) {
        this.requestNo = requestNo;
        this.date = date;
        this.createdBy = createdBy;
        this.status = status;
        ItemsCount = itemsCount;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemsCount() {
        return ItemsCount;
    }

    public void setItemsCount(String noOfItems) {
        this.ItemsCount = noOfItems;
    }

}

