package com;

@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
@FunctionalInterface
interface FindLarges{
	public String findLargest(int x, int y);
}
public class LamdaExamples {
	public static void main(String[] args) {
		Operation op1 = (x,y)->x+y;
		System.out.println("Addition "+op1.add(100, 200));
		Operation op2 = (int x,int y)->x+y;
		System.out.println("Addition "+op2.add(100, 200));
		Operation op3 = (a,b)->a+b;
		System.out.println("Addition "+op3.add(100, 200));
		Operation op4= (a,b)->{
			return a+b;
			};
		System.out.println("Addition "+op4.add(100, 200));
		
		
		FindLarges l1 = (x,y)-> {
			if(x>y) {
				return "1st number largest";
			}else {
				return "2nd number largest";
			}
		};
		System.out.println("find largest "+l1.findLargest(100, 50));
	}

}
