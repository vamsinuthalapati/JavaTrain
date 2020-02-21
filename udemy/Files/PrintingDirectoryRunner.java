package com.udemy.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class PrintingDirectoryRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path extract = Paths.get(".");
		//Files.list(Paths.get(".")).forEach(System.out :: println);
		
		Predicate<? super Path> predicate = path ->
									String.valueOf(path).contains(".java");
		Files.walk(extract, 4).filter(predicate ).forEach(System.out :: println);
	}

}
