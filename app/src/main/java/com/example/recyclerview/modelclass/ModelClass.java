package com.example.recyclerview.modelclass;

public class ModelClass {

    int contactPic;
    String contactName,contactEmail;

    public ModelClass(int contactPic, String contactName, String contactEmail) {
        this.contactPic = contactPic;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    public int getContactPic() {
        return contactPic;
    }

    public void setContactPic(int contactPic) {
        this.contactPic = contactPic;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
