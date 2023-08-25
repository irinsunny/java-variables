package com.nissan.app;

public class Box {
	int width,length,height;
	
	public Box() {
		this.width=0;
		this.length=0;
		this.height=0;
		
	}
	public Box(int w,int l,int h) {
		this.width=w;
		this.length=l;
		this.height=h;
		
	}


	public int volume(int w,int l,int h) {
		int v= w*l*h;
		return v;
	}
	public int volume() {
		int v= this.width*this.length*this.height;
		return v;
	}

	

}
