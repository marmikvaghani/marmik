
package com.example.cms.Panding_complaint;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class pandingComplaintdetails {


    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("cmp_id")
    @Expose
    private String cmpId;
    @SerializedName("partyName")
    @Expose
    private String partyName;
    @SerializedName("partyCity")
    @Expose
    private String partyCity;
    @SerializedName("engineerCity")
    @Expose
    private String engineerCity;
    @SerializedName("machineNo")
    @Expose
    private String machineNo;
    @SerializedName("details")
    @Expose
    private List<String> details;
    @SerializedName("details1")
    @Expose
    private String details1;
    @SerializedName("callBy")
    @Expose
    private String callBy;
    @SerializedName("logBy")
    @Expose
    private String logBy;
    @SerializedName("engineerName")
    @Expose
    private String engineerName;
    @SerializedName("createDateAt")
    @Expose
    private String createDateAt;
    @SerializedName("createTimeAt")
    @Expose
    private String createTimeAt;
    @SerializedName("upadateDateAt")
    @Expose
    private String upadateDateAt;
    @SerializedName("upadateTimeAt")
    @Expose
    private String upadateTimeAt;
    @SerializedName("isCompleted")
    @Expose
    private String isCompleted;
    @SerializedName("isAdmin")
    @Expose
    private Boolean isAdmin;
    @SerializedName("repeatComplaintNumber")
    @Expose
    private Integer repeatComplaintNumber;
    @SerializedName("machineType")
    @Expose
    private String machineType;
    @SerializedName("upadateAt")
    @Expose
    private String upadateAt;
    @SerializedName("anaysisCompaint")
    @Expose
    private List<Object> anaysisCompaint;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("endTime")
    @Expose
    private String endTime;
    @SerializedName("solution")
    @Expose
    private String solution;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("startComplaintLocation")
    @Expose
    private String startComplaintLocation;
    @SerializedName("endComplaintLocation")
    @Expose
    private String endComplaintLocation;
    @SerializedName("startAndEndTimeDuration")
    @Expose
    private String startAndEndTimeDuration;
    @SerializedName("rating")
    @Expose
    private String rating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCmpId() {
        return cmpId;
    }

    public void setCmpId(String cmpId) {
        this.cmpId = cmpId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyCity() {
        return partyCity;
    }

    public void setPartyCity(String partyCity) {
        this.partyCity = partyCity;
    }

    public String getEngineerCity() {
        return engineerCity;
    }

    public void setEngineerCity(String engineerCity) {
        this.engineerCity = engineerCity;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public String getDetails1() {
        return details1;
    }

    public void setDetails1(String details1) {
        this.details1 = details1;
    }

    public String getCallBy() {
        return callBy;
    }

    public void setCallBy(String callBy) {
        this.callBy = callBy;
    }

    public String getLogBy() {
        return logBy;
    }

    public void setLogBy(String logBy) {
        this.logBy = logBy;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getCreateDateAt() {
        return createDateAt;
    }

    public void setCreateDateAt(String createDateAt) {
        this.createDateAt = createDateAt;
    }

    public String getCreateTimeAt() {
        return createTimeAt;
    }

    public void setCreateTimeAt(String createTimeAt) {
        this.createTimeAt = createTimeAt;
    }

    public String getUpadateDateAt() {
        return upadateDateAt;
    }

    public void setUpadateDateAt(String upadateDateAt) {
        this.upadateDateAt = upadateDateAt;
    }

    public String getUpadateTimeAt() {
        return upadateTimeAt;
    }

    public void setUpadateTimeAt(String upadateTimeAt) {
        this.upadateTimeAt = upadateTimeAt;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getRepeatComplaintNumber() {
        return repeatComplaintNumber;
    }

    public void setRepeatComplaintNumber(Integer repeatComplaintNumber) {
        this.repeatComplaintNumber = repeatComplaintNumber;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getUpadateAt() {
        return upadateAt;
    }

    public void setUpadateAt(String upadateAt) {
        this.upadateAt = upadateAt;
    }

    public List<Object> getAnaysisCompaint() {
        return anaysisCompaint;
    }

    public void setAnaysisCompaint(List<Object> anaysisCompaint) {
        this.anaysisCompaint = anaysisCompaint;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartComplaintLocation() {
        return startComplaintLocation;
    }

    public void setStartComplaintLocation(String startComplaintLocation) {
        this.startComplaintLocation = startComplaintLocation;
    }

    public String getEndComplaintLocation() {
        return endComplaintLocation;
    }

    public void setEndComplaintLocation(String endComplaintLocation) {
        this.endComplaintLocation = endComplaintLocation;
    }

    public String getStartAndEndTimeDuration() {
        return startAndEndTimeDuration;
    }

    public void setStartAndEndTimeDuration(String startAndEndTimeDuration) {
        this.startAndEndTimeDuration = startAndEndTimeDuration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}