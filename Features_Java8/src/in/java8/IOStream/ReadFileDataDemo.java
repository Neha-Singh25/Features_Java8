package in.java8.IOStream;

import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFileDataDemo {
	public static void main(String[] args) {
		
		// FileReader fr = new FileReader(new File("info.txt"));
		//  character by character read the data
		
		//BufferedReader br = new BufferedReader(fr);
		//  line by line read the data.
		
		String filename = "hello.txt";
		//List<String> lines = new ArrayList<>();
		// lines() read all the data at a time and stored in a stream.
		try(Stream<String> stream = Files.lines(Paths.get(filename))){
			stream.forEach(line -> System.out.println(line));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
