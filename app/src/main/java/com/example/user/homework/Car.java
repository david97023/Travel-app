package com.example.user.homework;

import android.widget.BaseAdapter;
import android.widget.Filterable;

public class Car {
    private String name;
    private String addr;
    private String tel;

    public Car () {
    }

    public Car(String name, String addr, String tel) {
        this.name = name;
        this.addr = addr;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}