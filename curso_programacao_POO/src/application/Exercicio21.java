package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> vote = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (vote.containsKey(name)) {
					int votesCandidate = vote.get(name);
					vote.put(name, count + votesCandidate);
				} else {
					vote.put(name, count);
				}

				line = br.readLine();

			}

			for (String key : vote.keySet()) {
				System.out.println(key + ": " + vote.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}

		sc.close();

	}

}
