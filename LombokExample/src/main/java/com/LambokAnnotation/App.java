package com.LambokAnnotation;

public class App 
{
    public static void main( String[] args )
    {
    	Employee e= new Employee();
    	e.setEmpId(1);
    	e.setEmpName("rashid");
    	e.setAge(21);
    	System.out.println("student name is=:"+e.getEmpId());
    	System.out.println("student id is=:"+e.getEmpName());
    	System.out.println("student age is=:"+e.getAge());
    	
  
    	Employee e1= new Employee();
    	e1.setEmpId(2);
    	e1.setEmpName("khan");
    	e1.setAge(20);
    	System.out.println("student name is =:"+e1.getEmpId());
    	System.out.println("student id is=:"+e1.getEmpName());
    	System.out.println("student age is=:"+e1.getAge());
    	
    }
    }

