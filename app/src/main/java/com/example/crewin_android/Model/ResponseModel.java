package com.example.crewin_android.Model;


public class ResponseModel {
    private User user;
    private Boolean isHeader;
    private String infoType;
    private String infoName;
    private String infoDesc;

    public ResponseModel(User user, Boolean isHeader, String infoType){
        this.user = user;
        this.isHeader = isHeader;
        this.infoType = infoType;
    }

    public ResponseModel(Boolean isHeader, String infoType, String infoName, String infoDesc) {
        this.isHeader = isHeader;
        this.infoType = infoType;
        this.infoName = infoName;
        this.infoDesc = infoDesc;
    }

    public Boolean getHeader() {
        return isHeader;
    }

    public void setHeader(Boolean header) {
        isHeader = header;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoDesc() {
        return infoDesc;
    }

    public void setInfoDesc(String infoDesc) {
        this.infoDesc = infoDesc;
    }

}
