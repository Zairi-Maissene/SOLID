package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModule {
    private final DataReader dataReader;
    private final DataWriter dataWriter;
    private final Base64Encoder base64Encoder;
    private final Database db

    public EncodingModule(DataReader dataReader, DataWriter dataWriter, Base64Encoder base64Encoder, Database db) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
        this.base64Encoder = base64Encoder;
        this.db = db
    }

    public void encode() throws IOException {
        String data = dataReader.readData();
        String encodedData = base64Encoder.encode(data);
        dataWriter.writeData(encodedData);
        db.write(encodedData)
    }
}
