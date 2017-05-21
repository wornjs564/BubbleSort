public class Bubblesort {
	public static void main(String args[]) {
		int n, flag = 1, i, j, tm;
		int a[] = new int[100];
		n = 10;
		i = 0;

		for (j = 1; j < n + 1; j++) {

			a[j] = (int) (Math.random() * 100 + 1);
			System.out.print("\t" + a[j]);
		}

		while (true) {
			if (i >= (n - 1)) {
				break;
			} else {
				if (flag == 0) {
				} else {
					i = i + 1;
					j = 0;
					if (j < (n - i)) {
						while (j <= (n - i)) {
							j = j + 1;
							if (a[j] >= a[j + 1]){}else {
								tm = a[j];
								a[j] = a[j + 1];
								a[j + 1] = tm;
								flag = 1;
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println("===내림차순 버블 정렬값===");
		for (j = 1; j < n + 1; j++)
			System.out.print("\t" + a[j]);

	}
}
