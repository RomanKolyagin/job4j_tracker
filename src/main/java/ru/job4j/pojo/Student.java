package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String fullName;
    private String roomGroup;
    private Date data;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRoomGroup() {
        return roomGroup;
    }

    public void setRoomGroup(String roomGroup) {
        this.roomGroup = roomGroup;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}