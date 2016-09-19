package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        Pattern pattern;
        Matcher matcher;
        for (String book : books) {
            String toMatch = String.format(".*%s.*", partialBookTitle);
            pattern = Pattern.compile(toMatch);
            matcher = pattern.matcher(book);
            if (matcher.matches()) {
                printStream.println(book);
            }
        }

        printStream.flush();
    }
}
