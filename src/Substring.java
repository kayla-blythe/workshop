
public class Substring {

	public static void main(String[] args) {

		String str = new String();
		str = "flashlight";
		
		String w1 = str.substring(0, 5);
		String w2 = str.substring(5, 10);
		String w3 = str.substring(2, 5);
		String w4 = str.substring(0, 2) + str.substring(6, 10);
		String w5 = str.substring(0, 3) + str.charAt(7);
		String w6 = str.charAt(7) + str.substring(2, 4);
		String w7 = str.charAt(0) + str.substring(2, 4) + str.charAt(9);
		
	
		System.out.println("Part 1");
		
		System.out.println("=====================");
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
		System.out.println(w7);
		
		System.out.println();
		
		String part1 = "s";
		String part2 = "er";
		String part3 = "ning";
		String part4 = "en";
		String part5 = "ened";
		
		String w8 = str.substring(5, 10) + part1;
		String w9 = str.substring(5, 10) + part2;
		String w10 = str.substring(5, 10) + part3;
		String w11 = part4 + str.substring(5, 10) + part5;
		
		System.out.println("Part 2");
		
		System.out.println("=====================");
		System.out.println(w8);
		System.out.println(w9);
		System.out.println(w10);
		System.out.println(w11);
	}

}
