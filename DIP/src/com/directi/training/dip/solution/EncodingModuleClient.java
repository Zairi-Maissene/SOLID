package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DataReader fileDataReader = new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataWriter fileDataWriter = new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        Base64Encoder base64Encoder = new Base64Encoder();
        MyDatabase db = new MyDatabase()

        EncodingModule encodingModule = new EncodingModule(fileDataReader, fileDataWriter, base64Encoder, db);
        encodingModule.encode();
    }
}
