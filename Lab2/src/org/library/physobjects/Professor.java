package org.library.physobjects;



/**
 * access modifier in person class was made protected
 * accessor and getter methods was created for access code
 * person and employee class was made abstract class
 * increaseMaxLimit method was made abstract in employee class
 * and implemented in professor class
 * borrowbook and returnbook methods are implemented in employee class and abstract in person class
 * in Employee class replaced bookList.add(b1) to getBookList.add(b1)
 * increasemaxlimit function was not in mylibrary class it is newly implemented
 * so in output it is new...
 * 
 *  */


public class Professor extends Employee {
    private int accessCode;

    public Professor() {
    	accessCode = 0;
    }

    @Override
    public void increaseMaxLimit(int limit) {
    	maxBooks = limit;
    	System.out.println(getName()+"'s max limit is now "+getMaxBooks());
    }

    public int getAccessCode() {
    	return accessCode;
    }

    public void setAccessCode(int accessCode) {
    	this.accessCode = accessCode;
    }
}
