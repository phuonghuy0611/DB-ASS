package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.News;

public class New {
	private List<News> newsList;

	public New() {
		newsList = new ArrayList<>();
	}

	public void insertNews() {
		News news = new News();
		int[] rates = new int[3];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap Title: ");
		news.setTitle(scanner.nextLine());

		System.out.println("Nhap Publish Date: ");
		news.setPublishDate(scanner.nextLine());

		System.out.println("Nhap Author: ");
		news.setAuthor(scanner.nextLine());

		System.out.println("Nhap Content: ");
		news.setContent(scanner.nextLine());

		System.out.println("Nhap 3 danh gia: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Danh gia " + (i + 1) + ": ");
			rates[i] = scanner.nextInt();
		}
		news.setRates(rates);

		newsList.add(news);
	}

	public void viewListNews() {
		for (News news : newsList) {
			news.display();
		}
	}

	public void averageRate() {
		for (News news : newsList) {
			System.out.println("Title: " + news.getTitle() + " / Average Rate: " + news.calculate());
		}
	}
}
