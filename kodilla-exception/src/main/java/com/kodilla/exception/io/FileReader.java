package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException{
        ClassLoader classLoader = getClass().getClassLoader();


        //Files.lines(Paths.get(new File(getClass().getClassLoader().getResource("file/names.txt").getFile()).getPath())).collect(Collectors.joining(" "));
        try {
            String value = Files.lines(Paths.get("C:/Users/marci/IdeaProjects/Marcin-Sajkiewicz-Kodilla-Java/kodilla-exception/src/main/resources/file/names.txt")).collect(Collectors.joining(""));
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(classLoader.getResource("file/names.txt").getFile());

        try(Stream<String> fileLines = Files.lines(Paths.get("test.txt"))){
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
                throw new FileReaderException();
                } finally {
                System.out.println("I am gonna be here... always!");
                }

                }


                }
