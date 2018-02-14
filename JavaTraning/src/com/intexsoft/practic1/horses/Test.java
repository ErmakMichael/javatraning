package com.intexsoft.practic1.horses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		List<Hourse> hourses = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Hourse hourse = new Hourse();
			hourse.start();
			hourses.add(hourse);
		}

		int interations = 0;
		while (true) {
			for (int i = 0; i < hourses.size(); i++) {
				System.out.println("");
			}
			for (Hourse hourse : hourses) {
				System.out.println(hourse);
			}
			interations++;
			if (interations == 5) {
				int randomIndex = new Random().nextInt(hourses.size() - 1);
				hourses.get(randomIndex).stop();
			}

			Thread.sleep(1000);
		}
	}

}
