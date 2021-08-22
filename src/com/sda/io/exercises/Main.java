package com.sda.io.exercises;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    /**
     * Create a file with a „lorem ipsum” paragraph within – it can be done by copy-pasting
     * existing paragraph or generating it dynamically using Java library. Read that file.
     * a) Count words.
     * b) *Count special signs (like comma, dot, spaces).
     * c) *Select one word and print it’s number of occurences.
     */
    public static void main(String[] args) {

        String loremIpsumText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";

        createFile(loremIpsumText, "lorem-ipsum.txt");

        try {
            String result = readStringFromFile("lorem-ipsum.txt");

            System.out.println(result);

            int numberOfWords = result.split(" ").length;
            System.out.println("Number of words: " + numberOfWords);

            int numberOfDots = 0;
            int numberOfSpaces = 0;
            int numberOfCommas = 0;

            for(int i = 0; i < result.length(); i++) {
                char c = result.charAt(i);

                switch (c) {
                    case '.':
                        numberOfDots++;
                        break;
                    case ' ': {
                        numberOfSpaces++;
                        break;
                    }
                    case ',': {
                        numberOfCommas++;
                        break;
                    }
                }
            }

            System.out.println("Dots: " + numberOfDots);
            System.out.println("Commas: " + numberOfCommas);
            System.out.println("Spaces: " + numberOfSpaces);

            System.out.println("-----------");

            int numberOfRepeating = 0;
            String word = "the";

            String[] wordsArray = result.split(" ");
            for(String item : wordsArray) {
                if(item.equals(word)) {
                    numberOfRepeating++;
                }
            }

            System.out.println(word + " repeats " + numberOfRepeating +" times");

        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }


    }

    public static void createFile(String text, String filename) {
        try {
//            Files.writeString(numele_fisierului, continutul_fisierului)
            Files.writeString(Path.of(filename), text);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println(filename + " created with success!");
        }
    }

    public static String readStringFromFile(String filename) throws Exception {
        try {
            String fileContent = Files.readString(Path.of(filename));

            return fileContent;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // aruncam o exceptie
        throw new Exception("Invalid file name!");

    }
}
