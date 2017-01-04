package com.demo.bean;



public class Demo {
    private Long id;

    private String name;

    private Byte age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
    public static void main(String[] args) {
    	String autoCount=String.format("-%02d",Integer.valueOf("0"));
    	System.out.println(autoCount);
	}
}