package com.crio.xnews;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsApiResponse {
    private String status;
  


    public NewsApiResponse(){

    }
    public NewsApiResponse(String status, int totalResults, List<NewsArticle> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }
    private int totalResults;
    private List<NewsArticle> articles = new ArrayList<>();
    public String getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "NewsApiResponse [articles=" + articles + ", status=" + status + ", totalResults="
                + totalResults + "]";
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public List<NewsArticle> getArticles() {
        return articles;
    }
    public void setArticles(List<NewsArticle> articles) {
        this.articles = articles;
    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Use your IDE to generate getters and setters for the variables declared above.
// Use your IDE to generate the toString method to provide a string representation of the variables.

}
