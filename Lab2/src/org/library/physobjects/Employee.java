package org.library.physobjects;

public abstract class Employee extends Person {

	private int iD;
	public Employee() {
		this.iD = 0;
	}
		
		public int getiD() {
			return iD;
		}
		public void setiD(int iD) {
			this.iD = iD;
		}
		
		public void borrowBook(Book b1) {
			
	        boolean flag=false;
	        
			if(b1.getPerson()==null) { 
				flag = checkBookLimit() ;
			 
				if (flag ) {
					getBookList().add(b1);
					b1.setPerson(this);
				}	
			   else {  	
				   	System.out.println(b1.getTitle() + " cannot be lent to " + this.getName()+ ". Max limit of books is " + getMaxBooks());		
			   }
			}	
	    	else {
	    		System.out.println( b1.getTitle() + " cannot be lent to " + this.getName()+ ". Already lent to " + b1.getPerson().getName());
			
		   }
	 } 		
			
			public void returnBook(Book b1) {

		 		boolean flag=false;
				
				for ( Book aBook:this.getBookList()) {
				  
		            	if(aBook.getTitle()==b1.getTitle() && aBook.getAuthor()==b1.getAuthor()){ 
		          		
		          		flag=true;
		          	   
						}
				}
				
				if(flag){
					  		b1.setPerson(null);
			          		getBookList().remove(b1);
			          		
				}	
			}
		    public abstract void increaseMaxLimit(int limit);
}