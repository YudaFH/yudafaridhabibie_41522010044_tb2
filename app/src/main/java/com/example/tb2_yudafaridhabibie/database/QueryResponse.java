package com.example.tb2_yudafaridhabibie.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}