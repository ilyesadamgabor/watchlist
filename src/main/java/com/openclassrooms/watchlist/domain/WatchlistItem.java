package com.openclassrooms.watchlist.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.openclassrooms.watchlist.validation.BadMovie;
import com.openclassrooms.watchlist.validation.GoodMovie;
import com.openclassrooms.watchlist.validation.Priority;
import com.openclassrooms.watchlist.validation.Rating;

@GoodMovie
@BadMovie
public class WatchlistItem {

	@NotBlank(message="Please enter the title")
	private String title;
	
	@Rating
	private String rating;
	
	@Priority
	private String priority;
	
	@Size(max=50 , message="Comment should be max 50 characters")
	private String comment;
	private Integer id;
	
	public WatchlistItem() {		
	}
	
	public WatchlistItem(String title, String rating, String priority, String comment, Integer id) {
		super();
		this.title = title;
		this.rating = rating;
		this.priority = priority;
		this.comment = comment;
		this.id = id;
	}	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
