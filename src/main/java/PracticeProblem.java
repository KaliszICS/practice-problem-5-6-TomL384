public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] names, int[] ages, String name){
		int count = 0;
		for (int i = 0; i < names.length; i ++){
			if (names[i].equals(name)){
				count = i;
				return ages[count];
			}
		}
		return ages[count];
	}

	public static int[] createLengthArray(String[] arr){
		int count = 0;
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i ++){
			count = arr[i].length();
			arr1[i] = count;
				
		}
		return arr1;
	}

	public static void swapPeople(String[] names, int[] ages, String name, String name1){
		int s1 = 0;
		int s2 = 0;
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < names.length; i++){
			if (names[i].equals(name)&&count==0){
				s1 = i;
				count ++;
			}
			if (names[i].equals(name1)&&count1==0){
				s2 = i;
				count1 ++;
			}
		}
		String swap1a = names[s2];
		String swap1b = names[s1];
		int swap2a = ages[s2];
		int swap2b = ages[s1];
		names[s1] = swap1a;
		names[s2] = swap1b;
		ages[s1] = swap2a;
		ages[s2] = swap2b;
	}
		
}

