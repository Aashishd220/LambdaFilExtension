//program to take the directory from user and ask for the extension

package com.cg.lambdafileextension;

import java.io.File;
import java.util.Scanner;

public class FileExtension {
	public static void main(String args[]) {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter file directory");
		String fileDirectory = get.next();// taking directory from the user

		System.out.println("Enter the extension you want");
		String extension = get.next();// taking extension from the user

		File dir = new File(fileDirectory);// passing path to dir

		String[] files = dir.list((a, b) -> b.toLowerCase().endsWith(extension));// storing the files with given
																					// extension in files
		// iterating each element
		for (String file : files) {
			System.out.println(file);
		}
	}

}
