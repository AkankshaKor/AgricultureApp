package com.example.hp.agri_techno;

import android.widget.EditText;

public class BuySell
{
    int phno;
    String Name;
    String Address;
    String Type;
    String Qty;
    public int getPhno() { return phno; }

    public void setPhno(int phno) { this.phno = phno; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address=Address;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {   this.Type=Type; }

    public String getQty() { return Qty; }

    public void setQty(String Qty) { this.Qty = Qty; }
}
