package com.Rodaki.service;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;

@Service
public class MinioService {

    private final MinioClient minioClient;
    private final String bucket;

    public MinioService(
        @Value("${minio.url}") String url,
        @Value("${minio.access-key}") String accessKey,
        @Value("${minio.secret-key}") String secretKey,
        @Value("${minio.bucket}") String bucket) {

        this.minioClient = MinioClient.builder()
                .endpoint(url)
                .credentials(accessKey, secretKey)
                .build();
        this.bucket = bucket;
    }

    public String uploadFile(String fileName, InputStream data, String contentType) throws Exception {
        minioClient.putObject(
                PutObjectArgs.builder()
                        .bucket(bucket)
                        .object(fileName)
                        .stream(data, -1, 10485760)
                        .contentType(contentType)
                        .build()
        );
        return String.format("http://localhost:9000/%s/%s", bucket, fileName);
    }
}
