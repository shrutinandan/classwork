package com.cybage;

import java.util.Comparator;

class HDTV 
{
	private String brand;
	private int size;
	public HDTV(String brand, int size) {
		this.brand = brand;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return String.format("HDTV [brand=%s, size=%s]", brand, size);
	}
	
}
class SizeComparator implements Comparator<HDTV>
{

	@Override
	public int compare(HDTV o1, HDTV o2) {
		int tv1=o1.getSize();
		int tv2=o2.getSize();
		if(tv1>tv2)
		return 1;
	   else if(tv1<tv2)
		   return -1;
		return 0;
	}
	
}
public class MainDemo {
	public static void main(String args[])
	List <HDTV> 
	{
		
	}

}
