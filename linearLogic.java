		System.out.println("The array: ");
		int[] arr = [55, 11, 21, 99, 06];
		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + ", ");
		System.out.println("Enter a number to search: ");
		int k = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < 5; i++) {
			if (arr[i] == k) {
				System.out.println("Number found at position: " + (i + 1));
			} else {
				System.out.println("Number not found in array");
			}
		}
