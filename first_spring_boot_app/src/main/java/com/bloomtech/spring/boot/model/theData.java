package com.bloomtech.spring.boot.model;

import java.util.Objects;
public class theData {
    String theData;
    public theData(){}

    public theData(String theData) {
        this.theData = theData;
    }

    public String getTheData() {
        return theData;
    }

    public void setTheData(String theData) {
        this.theData = theData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        theData theData1 = (theData) o;
        return Objects.equals(theData, theData1.theData);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(theData);
    }

    @Override
    public String toString() {
        return "theData{" +
                "theData='" + theData + '\'' +
                '}';
    }
}
