package edu.network;

public class Node {
	
	public String data;
	public Node link;

// toString() : Object class(모든 클래스의 가장 상위 클래스) 안의 함수 => 클래스이름 +@+16진수 형태로 출력

	@Override
	public String toString() {  
		return "노드의 데이터 값은 " + data + " 입니다." ;
	}

}
