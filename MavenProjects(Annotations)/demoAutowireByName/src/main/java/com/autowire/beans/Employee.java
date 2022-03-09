package com.autowire.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Employee {
    private String fullName;

    private DepartmentBean departmentBean;

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }
    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "fullName='" + fullName + '\'' +
//                ", departmentBean=" + departmentBean +
//                '}';
//    }
//
//    public Employee(String fullName, DepartmentBean departmentBean) {
//        this.fullName = fullName;
//        this.departmentBean = departmentBean;
//    }
}
