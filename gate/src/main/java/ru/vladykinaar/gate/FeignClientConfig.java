package ru.vladykinaar.gate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vladykinaar.gate.client.ApiClient;
import ru.vladykinaar.gate.client.api.StudentDataApi;

@Configuration
public class FeignClientConfig {

    @Bean
    public StudentDataApi studentDataApi() {
        ApiClient apiClient = new ApiClient();
        // адрес сервиса data-service
        apiClient.setBasePath("http://localhost:8083");
        return apiClient.buildClient(StudentDataApi.class);
    }
}