package com.xfhy.prototype;

/**
 * @author : xfhy
 * Create time : 2019/12/25 21:22
 * Description :
 */
class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExpernce(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历: " + timeArea + " " + company);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
