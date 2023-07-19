package com.lakjay.joblisting.repository;

import com.lakjay.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{



}
