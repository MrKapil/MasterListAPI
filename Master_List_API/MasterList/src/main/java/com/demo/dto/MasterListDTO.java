package com.demo.dto;

public class MasterListDTO {
    private String parentCode;
    private String parentName;
    private String name;

    // Constructor
    public MasterListDTO() {
    }

    public MasterListDTO(String parentCode, String parentName, String name) {
        this.parentCode = parentCode;
        this.parentName = parentName;
        this.name = name;
    }

    // Getters and Setters
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

