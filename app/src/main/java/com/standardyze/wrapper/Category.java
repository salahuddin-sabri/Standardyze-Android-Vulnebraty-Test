package com.standardyze.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("companyId")
@Expose
private Integer companyId;
@SerializedName("categoryKey")
@Expose
private String categoryKey;
@SerializedName("action")
@Expose
private String action;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getCompanyId() {
return companyId;
}

public void setCompanyId(Integer companyId) {
this.companyId = companyId;
}

public String getCategoryKey() {
return categoryKey;
}

public void setCategoryKey(String categoryKey) {
this.categoryKey = categoryKey;
}

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}