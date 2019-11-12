
package com.example.crewin_android.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("KULLANICI_ID")
    @Expose
    private Double kULLANICIID;
    @SerializedName("AD")
    @Expose
    private String aD;
    @SerializedName("SOYADI")
    @Expose
    private String sOYADI;
    @SerializedName("ULKE_ADI")
    @Expose
    private String uLKEADI;
    @SerializedName("SEHIR_ADI")
    @Expose
    private String sEHIRADI;
    @SerializedName("POZISYON")
    @Expose
    private String pOZISYON;
    @SerializedName("E_MAIL")
    @Expose
    private String eMAIL;
    @SerializedName("KULLANICI_ADI")
    @Expose
    private String kULLANICIADI;
    @SerializedName("DOGUM_TARIHI")
    @Expose
    private String dOGUMTARIHI;
    @SerializedName("LIMAN_CUZDAN_NO")
    @Expose
    private String lIMANCUZDANNO;
    @SerializedName("RESIM_URL")
    @Expose
    private String rESIMURL;
    @SerializedName("TC_NO")
    @Expose
    private Double tCNO;
    @SerializedName("MEDENI_DURUMU")
    @Expose
    private String mEDENIDURUMU;
    @SerializedName("CINSIYET")
    @Expose
    private String cINSIYET;
    @SerializedName("SGK_NO")
    @Expose
    private Object sGKNO;
    @SerializedName("ASKERLIK_DURUMU")
    @Expose
    private String aSKERLIKDURUMU;
    @SerializedName("ASKERLIK_BIT_TARIHI")
    @Expose
    private String aSKERLIKBITTARIHI;
    @SerializedName("EV_TEL")
    @Expose
    private String eVTEL;
    @SerializedName("CEP_TEL")
    @Expose
    private String cEPTEL;
    @SerializedName("ADRES")
    @Expose
    private String aDRES;
    @SerializedName("FACEBOOK")
    @Expose
    private String fACEBOOK;
    @SerializedName("LINKEDIN")
    @Expose
    private String lINKEDIN;
    @SerializedName("SKYPE")
    @Expose
    private String sKYPE;
    @SerializedName("QQ")
    @Expose
    private String qQ;
    @SerializedName("WE_CHAT")
    @Expose
    private String wECHAT;
    @SerializedName("KAN_GRUBU")
    @Expose
    private Object kANGRUBU;
    @SerializedName("BOY")
    @Expose
    private Object bOY;
    @SerializedName("KILO")
    @Expose
    private Object kILO;
    @SerializedName("BEDEN")
    @Expose
    private Object bEDEN;
    @SerializedName("AYAKKABI_NO")
    @Expose
    private Object aYAKKABINO;
    @SerializedName("IS_DURUMU")
    @Expose
    private String iSDURUMU;
    @SerializedName("HAKKINDA")
    @Expose
    private String hAKKINDA;
    @SerializedName("SEFER")


    public Double getKULLANICIID() {
        return kULLANICIID;
    }

    public void setKULLANICIID(Double kULLANICIID) {
        this.kULLANICIID = kULLANICIID;
    }

    public String getAD() {
        return aD;
    }

    public void setAD(String aD) {
        this.aD = aD;
    }

    public String getSOYADI() {
        return sOYADI;
    }

    public void setSOYADI(String sOYADI) {
        this.sOYADI = sOYADI;
    }

    public String getULKEADI() {
        return uLKEADI;
    }

    public void setULKEADI(String uLKEADI) {
        this.uLKEADI = uLKEADI;
    }

    public String getSEHIRADI() {
        return sEHIRADI;
    }

    public void setSEHIRADI(String sEHIRADI) {
        this.sEHIRADI = sEHIRADI;
    }

    public String getPOZISYON() {
        return pOZISYON;
    }

    public void setPOZISYON(String pOZISYON) {
        this.pOZISYON = pOZISYON;
    }

    public String getEMAIL() {
        return eMAIL;
    }

    public void setEMAIL(String eMAIL) {
        this.eMAIL = eMAIL;
    }

    public String getKULLANICIADI() {
        return kULLANICIADI;
    }

    public void setKULLANICIADI(String kULLANICIADI) {
        this.kULLANICIADI = kULLANICIADI;
    }

    public String getDOGUMTARIHI() {
        return dOGUMTARIHI;
    }

    public void setDOGUMTARIHI(String dOGUMTARIHI) {
        this.dOGUMTARIHI = dOGUMTARIHI;
    }

    public String getLIMANCUZDANNO() {
        return lIMANCUZDANNO;
    }

    public void setLIMANCUZDANNO(String lIMANCUZDANNO) {
        this.lIMANCUZDANNO = lIMANCUZDANNO;
    }

    public String getRESIMURL() {
        return rESIMURL;
    }

    public void setRESIMURL(String rESIMURL) {
        this.rESIMURL = rESIMURL;
    }

    public Double getTCNO() {
        return tCNO;
    }

    public void setTCNO(Double tCNO) {
        this.tCNO = tCNO;
    }

    public String getMEDENIDURUMU() {
        return mEDENIDURUMU;
    }

    public void setMEDENIDURUMU(String mEDENIDURUMU) {
        this.mEDENIDURUMU = mEDENIDURUMU;
    }

    public String getCINSIYET() {
        return cINSIYET;
    }

    public void setCINSIYET(String cINSIYET) {
        this.cINSIYET = cINSIYET;
    }

    public Object getSGKNO() {
        return sGKNO;
    }

    public void setSGKNO(Object sGKNO) {
        this.sGKNO = sGKNO;
    }

    public String getASKERLIKDURUMU() {
        return aSKERLIKDURUMU;
    }

    public void setASKERLIKDURUMU(String aSKERLIKDURUMU) {
        this.aSKERLIKDURUMU = aSKERLIKDURUMU;
    }

    public String getASKERLIKBITTARIHI() {
        return aSKERLIKBITTARIHI;
    }

    public void setASKERLIKBITTARIHI(String aSKERLIKBITTARIHI) {
        this.aSKERLIKBITTARIHI = aSKERLIKBITTARIHI;
    }

    public String getEVTEL() {
        return eVTEL;
    }

    public void setEVTEL(String eVTEL) {
        this.eVTEL = eVTEL;
    }

    public String getCEPTEL() {
        return cEPTEL;
    }

    public void setCEPTEL(String cEPTEL) {
        this.cEPTEL = cEPTEL;
    }

    public String getADRES() {
        return aDRES;
    }

    public void setADRES(String aDRES) {
        this.aDRES = aDRES;
    }

    public String getFACEBOOK() {
        return fACEBOOK;
    }

    public void setFACEBOOK(String fACEBOOK) {
        this.fACEBOOK = fACEBOOK;
    }

    public String getLINKEDIN() {
        return lINKEDIN;
    }

    public void setLINKEDIN(String lINKEDIN) {
        this.lINKEDIN = lINKEDIN;
    }

    public String getSKYPE() {
        return sKYPE;
    }

    public void setSKYPE(String sKYPE) {
        this.sKYPE = sKYPE;
    }

    public String getQQ() {
        return qQ;
    }

    public void setQQ(String qQ) {
        this.qQ = qQ;
    }

    public String getWECHAT() {
        return wECHAT;
    }

    public void setWECHAT(String wECHAT) {
        this.wECHAT = wECHAT;
    }

    public Object getKANGRUBU() {
        return kANGRUBU;
    }

    public void setKANGRUBU(Object kANGRUBU) {
        this.kANGRUBU = kANGRUBU;
    }

    public Object getBOY() {
        return bOY;
    }

    public void setBOY(Object bOY) {
        this.bOY = bOY;
    }

    public Object getKILO() {
        return kILO;
    }

    public void setKILO(Object kILO) {
        this.kILO = kILO;
    }

    public Object getBEDEN() {
        return bEDEN;
    }

    public void setBEDEN(Object bEDEN) {
        this.bEDEN = bEDEN;
    }

    public Object getAYAKKABINO() {
        return aYAKKABINO;
    }

    public void setAYAKKABINO(Object aYAKKABINO) {
        this.aYAKKABINO = aYAKKABINO;
    }

    public String getISDURUMU() {
        return iSDURUMU;
    }

    public void setISDURUMU(String iSDURUMU) {
        this.iSDURUMU = iSDURUMU;
    }

    public String getHAKKINDA() {
        return hAKKINDA;
    }

    public void setHAKKINDA(String hAKKINDA) {
        this.hAKKINDA = hAKKINDA;
    }



}
