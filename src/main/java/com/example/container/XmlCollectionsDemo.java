package com.example.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @Author ws
 * @create 2023/3/9 11:21
 * @Description
 */
public class XmlCollectionsDemo {
    private List<Object> list;
    private Properties pros;
    private Set<Object> sets;
    private Map<String, Object> maps;
    private Date date;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public static void main(String[] args) throws Exception{
        ApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"ApplicationContext.xml"}
        );
        BeanFactory factory=context;
        XmlCollectionsDemo annotationInstance=
                (XmlCollectionsDemo) factory.getBean("xmlCollectionsDemo");
        System.out.println(annotationInstance.list);
        System.out.println(annotationInstance.pros);
        System.out.println(annotationInstance.sets);
        System.out.println(annotationInstance.maps);
        System.out.println(annotationInstance.date);




    }
}
