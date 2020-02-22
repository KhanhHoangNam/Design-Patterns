package com.khanhhn.design_patterns.structural_patterns.decorator;

public class Manager extends EmployeeDecorator {

    protected Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning task.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
