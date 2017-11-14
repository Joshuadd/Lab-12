package BinaryTrees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab12 {
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("C:\\Users\\joshu\\eclipse-workspace\\Lab 12\\src\\BinaryTrees\\students.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BinarySearchTree<StudentGPA> tree = new BinarySearchTree<StudentGPA>();
		
		while(input.hasNext()) {
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);
			StudentGPA student = new StudentGPA(lineScanner.nextInt(), lineScanner.next(), lineScanner.nextDouble());
			tree.insert(student);
			lineScanner.close();
		}
		
		TreeIterator<StudentGPA> iter = (TreeIterator<StudentGPA>) tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
