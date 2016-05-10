package de.claudioaltamura.java8.misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesExample {
	
	public static void main(final String[] args) throws IOException
	{

	final String tempDirPath = System.getProperty("java.io.tmpdir");
	final Path destinationFile = Paths.get(tempDirPath + "/WriteText.txt");
	final List<String> content = Arrays.asList("This", "is", "the", "content");

	final Path resultFile = Files.write(destinationFile, content,
			StandardOpenOption.CREATE,
			StandardOpenOption.APPEND);

	final Stream<String> contentAsStream = Files.lines(resultFile);
	final Map<Integer, List<String>> filterdAndGrouped = contentAsStream.
			filter(word -> word.length() > 3).
			collect(Collectors.groupingBy(String::length));
	System.out.println(filterdAndGrouped);

	final Stream<Path> tmpDirContent = Files.list(Paths.get(tempDirPath));
	tmpDirContent.filter(path -> path.toString().endsWith(".txt")).forEach(System.out::println);
	}

}
