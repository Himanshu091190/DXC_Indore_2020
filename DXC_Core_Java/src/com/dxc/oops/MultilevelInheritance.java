package com.dxc.oops;

class GrandFather {
	void hobbies() {
		System.out.println("Gandfather watching Devotional channel");
	}
}

class Father extends GrandFather {
	void profession() {
		System.out.println("Father doing Trading business");
	}
}

class Son extends Father {
	void education() {
		System.out.println("son doing Engineering");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Son mSon = new Son();
		mSon.education();
		mSon.profession();
		mSon.hobbies();
	}
}
