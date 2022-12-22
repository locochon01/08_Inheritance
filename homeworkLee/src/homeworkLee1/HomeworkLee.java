package homeworkLee1;

public class HomeworkLee {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 - (iNum2 * 2));
		System.out.println((int) dNum);
		System.out.println();
		
		System.out.println((double) iNum2 * 2 + (int) dNum);
		// System.out.println(iNum2 * dNum) --> 자동 형변환으로 10.0 출력 
		System.out.println((double) iNum1);
		System.out.println();
		
		System.out.println((double) iNum1 / (double) iNum2);
		System.out.println(dNum);
		System.out.println();
		
		System.out.println((int) fNum);
		System.out.println(iNum1 / (int) fNum);
		System.out.println();
		
		System.out.println((float) iNum1 / fNum);
		System.out.println((double) iNum1 / fNum);
		System.out.println();
		
		System.out.println("'" + ch + "'");
		System.out.println((int) ch);
		System.out.println((int) ch + iNum1);
		System.out.println("'" + (char) (ch + iNum1) + "'");
		
		
		
	}

}
