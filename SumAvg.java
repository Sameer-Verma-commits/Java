public class SumAvg {
	public static void main(String args[]) {
		if (args.length != 3) {
			System.out.println("Kindly Enter Only Three Numbers.");
			return;
		}
		int i = 0, sum = 0;
		while (i < 3) {
			sum += Integer.parseInt(args[i]);
			i++;
		}
		float avg = (float) (sum / 3.0);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		return;
	}
}