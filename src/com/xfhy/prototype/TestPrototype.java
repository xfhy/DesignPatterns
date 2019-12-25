package com.xfhy.prototype;

/**
 * @author : xfhy
 * Create time : 2019/12/25 21:12
 * Description :
 */
class TestPrototype {

    public static void main(String[] args) {
        Resume resume1 = new Resume("小菜");
        resume1.setPersonalInfo("男", "23");
        resume1.setWorkExpernce("1988-1999", "xx公司");
        resume1.display();

        System.out.println("----- resume1 " + resume1);
        try {
            Resume resume2 = (Resume) resume1.clone();
            resume2.display();
            System.out.println("----- resume2 " + resume2);

            Resume resume3 = (Resume) resume2.clone();
            resume3.display();
            System.out.println("----- resume3 " + resume3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
