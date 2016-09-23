

public class Trafficsignal {
	//int i;
	
	
 
		  public static void main(String[] args) {  
			  
		    final String resource1 = "way 1";  
		    final String resource2 = "way 2";
		    final String resource3 = "way 3";
		    final String resource4 = "way 4";
		    
		     //creating the first thread
		    Thread t1 = new Thread() {  
		    	
		      public void run() {  //run method
		    	  
		    	  
		    	  
		          synchronized (resource1) {  //locking the resource 1(Way 1) by thread 1
		        	  						
		        	  System.out.println("signal is green for Thread 1:-go ");
		           System.out.println("Thread 1: is going to "+resource1);  
		  
		           try { 
		        	     
		        	   Thread.sleep(1000);
		        	   
		        	   }
		           catch (Exception e)
		           {
		        	   
		           }  
		  
		           synchronized (resource2) {  
		            System.out.println("Thread 2:is waitnig"); 
		            for(int i=0;i<10;i++)
		        	   {
		        		   System.out.println(i);
		        		   try{
		        			   Thread.sleep(1000);
		        		   }
		        		   catch(Exception e)
		        		   {
		        			   
		        		   }
		        	   }
		            
		           } 
		           synchronized (resource3) {  
			            System.out.println("Thread 3:is waitnig"); 
			            for(int i=0;i<10;i++)
			        	   {
			        		   System.out.println(i);
			        		   try{
			        			   
			        		   Thread.sleep(1000);
			        		   }
			        		   catch(Exception e)
			        		   {
			        			   
			        		   }
			        	   }
			            
			           }
		           synchronized (resource4) {  
			            System.out.println("Thread 4:is waitnig"); 
			            for(int i=0;i<10;i++)
			        	   {
			        		   System.out.println(i);
			        		   try{
			        		   Thread.sleep(1000);
			        		   }
			        		   catch(Exception e)
			        		   {
			        			   
			        		   }
			        	   }
			            
			           }
		          
		         }  
		      }  
		    };  
		  
		    //creating thread2  
		    Thread t2 = new Thread() {  
		      public void run() {  //run method
		        synchronized (resource1) {  //locking the resource 2(Way 2) by thread 2
		        	System.out.println("signal is green for Thread 2:-go ");
		          System.out.println("Thread 2: is going to "+resource2);  
		  
		          try {
		        	  Thread.sleep(1000);
		        	  }
		          catch (Exception e) 
		          {
		        	  
		          }  
		  
		          synchronized (resource2) {  
			            System.out.println("Thread 1:is waitnig"); 
			            for(int i=0;i<10;i++)
			        	   {
			        		   System.out.println(i);
			        		   try
			        		   {
			        			   Thread.sleep(1000);
			        		   }
			        		   catch(Exception e)
			        		   {
			        			   
			        		   }
			        	   }
			            
			           } 
			           synchronized (resource3) {  
				            System.out.println("Thread 3:is waitnig"); 
				            for(int i=0;i<10;i++)
				        	   {
				        		   System.out.println(i);
				        		   try
				        		   {
				        			   Thread.sleep(1000);
				        		   }
				        		   catch(Exception e)
				        		   {
				        			   
				        		   }
				        	   }
				            
				           }
			           synchronized (resource4) {  
				            System.out.println("Thread 4:is waitnig"); 
				            for(int i=0;i<10;i++)
				        	   {
				        		   System.out.println(i);
				        		   try
				        		   {
				        			   Thread.sleep(1000);
				        		   }
				        		   catch(Exception e)
				        		   {
				        			   
				        		   }
				        	   }
				            
				           }
		        }  
		      }  
		    };  
		    //creating new thread
		    Thread t3 = new Thread() {  
			      public void run() {  //run method
			        synchronized (resource1) {  //locking the resource 3(Way 3) by thread 3
			        	System.out.println("signal is green for Thread 3:-go ");
			          System.out.println("Thread 3: is going to "+resource3);  
			  
			          try 
			          { 
			        	  Thread.sleep(1000);
			          }
			          catch (Exception e) 
			          {
			        	  
			          }  
			  
			          synchronized (resource2) {  
				            System.out.println("Thread 1:is waitnig"); 
				            for(int i=0;i<10;i++)
				        	   {
				        		   System.out.println(i);
				        		   try
				        		   {
				        			   Thread.sleep(1000);
				        		   }
				        		   catch(Exception e)
				        		   {
				        			   
				        		   }
				        	   }
				            
				           } 
				           synchronized (resource3) {  
					            System.out.println("Thread 2:is waitnig"); 
					            for(int i=0;i<10;i++)
					        	   {
					        		   System.out.println(i);
					        		   try
					        		   {
					        			   Thread.sleep(1000);
					        		   }
					        		   catch(Exception e)
					        		   {
					        			   
					        		   }
					        	   }
					            
					           }
				           synchronized (resource4) {  
					            System.out.println("Thread 4:is waitnig"); 
					            for(int i=0;i<10;i++)
					        	   {
					        		   System.out.println(i);
					        		   try
					        		   {
					        			   Thread.sleep(1000);
					        		   }
					        		   catch(Exception e)
					        		   {
					        			   
					        		   }
					        	   }
					            
					           }
			          }  
			        }  
			       
			    };
			    //creating new thread
			    Thread t4 = new Thread() {  
				      public void run() {  //run method
				        synchronized (resource1) {  //locking the resource 4(Way 4) by thread 4
				        	System.out.println("signal is green for Thread 4:-go ");
				          System.out.println("Thread 4: is going to "+resource4);  
				  
				          try 
				          {
				        	  Thread.sleep(1000);
				          } 
				          catch (Exception e)
				          {
				        	  
				          }  
				  
				          synchronized (resource2) {  
					            System.out.println("Thread 1:is waitnig"); 
					            for(int i=0;i<10;i++)
					        	   {
					        		   System.out.println(i);
					        		   try
					        		   {
					        			   Thread.sleep(1000);
					        		   }
					        		   catch(Exception e)
					        		   {
					        			   
					        		   }
					        	   }
					            
					           } 
					           synchronized (resource3) {  
						            System.out.println("Thread 2:is waitnig"); 
						            for(int i=0;i<10;i++)
						        	   {
						        		   System.out.println(i);
						        		   try{
						        			   Thread.sleep(1000);
						        			  }
						        		   catch(Exception e)
						        		   {
						        			   
						        		   }
						        	   }
						            
						           }
					           synchronized (resource4) {  
						            System.out.println("Thread 3:is waitnig"); 
						            for(int i=0;i<10;i++)
						        	   {
						        		   System.out.println(i);
						        		   try
						        		   {
						        			   Thread.sleep(1000);
						        		   }
						        		   catch(Exception e)
						        		   {
						        			   
						        		   }
						        	   }
						            
						           }
				        }  
				      }  
				    }; 
		  
		    //starting the threads  
		    t1.start();  
		    t2.start();
		    t3.start();
		    t4.start();
		  }  
		}  


