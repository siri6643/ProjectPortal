package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Feedback {
	@Id
    @GeneratedValue
    private Long reviewId;

    @ManyToOne
    private ProjectIdea idea;

    @ManyToOne
    private User reviewer;

    private String comments;
    private String decision;
    private LocalDate reviewDate;
    
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	public ProjectIdea getIdea() {
		return idea;
	}
	public void setIdea(ProjectIdea idea) {
		this.idea = idea;
	}
	public User getReviewer() {
		return reviewer;
	}
	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public LocalDate getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}
    
}
