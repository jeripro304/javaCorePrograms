package org.example;

import java.io.Serializable;

public class Employee implements Serializable {
    int eid;
    String ename;
    int salary;

    public Employee(int eid, String ename, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
