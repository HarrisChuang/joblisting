package com.phchuang.joblisting.repository;

import com.phchuang.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
