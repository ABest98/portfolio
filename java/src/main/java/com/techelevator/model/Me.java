package com.techelevator.model;

import java.util.Objects;

public class Me {

    private int myId;
    private String myName;
    private int myAge;

    public Me() {

    }

    public Me(int myId, String myName, int myAge) {
        this.myId = myId;
        this.myName = myName;
        this.myAge = myAge;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Me me = (Me) o;
        return myId == me.myId && myAge == me.myAge && Objects.equals(myName, me.myName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myId, myName, myAge);
    }

    @Override
    public String toString() {
        return "Me{" +
                "myId=" + myId +
                ", myName='" + myName + '\'' +
                ", myAge=" + myAge +
                '}';
    }
}
