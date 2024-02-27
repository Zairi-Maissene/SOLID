package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements DataWriter {
    private String filePath;

    public FileDataWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void writeData(String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        }
    }
}
