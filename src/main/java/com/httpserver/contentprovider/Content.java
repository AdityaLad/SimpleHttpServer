package com.httpserver.contentprovider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service("content")
public class Content {

    public static String getMyString() throws IOException {
        String myString = null;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        Thread.currentThread().getContextClassLoader().getResourceAsStream("mystring.txt")))) {
            myString = br.lines().collect(Collectors.joining("\n"));
        }

        return myString;
    }
}
