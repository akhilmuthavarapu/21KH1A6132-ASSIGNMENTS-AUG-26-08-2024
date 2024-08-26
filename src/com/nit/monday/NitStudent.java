package com.nit.monday;

class details
{
	int rollNo;
	String name;
	int maths;
	int sci;
	int eng;

	int fee;
	int attd;

	public details(int rollNo, String name, int maths, int sci, int eng, int fee, int attd) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		this.fee = fee;
		this.attd = attd;
	}

	@Override
	public String toString() {
		return "NitStudent [rollNo=" + rollNo + ", name=" + name + ", maths=" + maths + ", sci=" + sci + ", eng=" + eng
				+ ", fee=" + fee + ", attd=" + attd + "]";
	}

}

public class NitStudent {
	
	static int getRandomNo(int max, int min) {

		int range = max - min + 1;

		return (int) (Math.random() * range) + min;

	}
	public static void main(String[] args) {
		
		int max = 350;

		details[] allStus = new details[max];

		for (int i = 0; i < max; i++) {
			allStus[i] = new details(getRandomNo(1000, 500), "Stu" + getRandomNo(0, 100), getRandomNo(60, 90),
					getRandomNo(0, 80), getRandomNo(50, 100), getRandomNo(20000, 45000), getRandomNo(30, 69));

		}

		

		System.out.println("All Student Passed List anf fee<100000");
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		getAllPassedStudentList(allStus);
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		
		
		
		
	}


	static void getAllPassedStudentList(details[] allStus) {

		details eachStu;
		for (int i = 0; i < allStus.length; i++) {
			eachStu = allStus[i];
			if ((eachStu.maths > 35) && 
					(eachStu.sci > 35) && 
					(eachStu.eng > 35) && (eachStu.fee<100000)
				) {
				
				System.out.println(eachStu+"\n\n");

			}
		}

	}

}
