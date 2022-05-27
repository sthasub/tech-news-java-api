package com.technews.repository;

import com.technews.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * an instance-level annotation, @Query
 * method-level annotation of @Param("id)
 */
public interface VoteRepository extends JpaRepository<Vote, Integer> {
    //This annotation will take a single argument,
    // which will be the specific query we want to use ("SELECT count(*) FROM Vote v where v.postId = :id").
    @Query("SELECT count(*) FROM Vote v where v.postId = :id")
    int countVotesByPostId(@Param("id") Integer id);

}