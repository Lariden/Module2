package com.alevel.module;

import java.io.IOException;
import java.nio.file.*;


public class MyFile {
    public static void main(String[] args) throws IOException {

            Files.walkFileTree(Paths.get("C:\\Users\\Деныс\\Desktop\\testFolder"), new MyFileVisitor());

    }
}

