package com.lakjay.joblisting.repository;

import com.lakjay.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post>findByText(String text);
}
