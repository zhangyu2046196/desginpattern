package com.youyuan.princple.uml.dependence;

/**
 * @author zhangy
 * @version 1.0
 * @description  测试UML类图的依赖关系
 * @date 2019/11/21 8:33
 */
public class PersonServiceBean {

    private PersonDao personDao;//类
    public void save(Person person){}
    public IDCard getIDCard(Integer personid){
        return null;
    }
    public void modify(){
        Department department=new Department();
    }

}
