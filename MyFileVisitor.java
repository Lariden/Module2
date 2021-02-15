package com.alevel.module;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        List<String> lines = Files.readAllLines(file);
        for (String s : lines) {
            if (s.contains("This is the file we need")) {
                System.out.println(file.toAbsolutePath());
            }
        }

        return FileVisitResult.CONTINUE;
    }
}