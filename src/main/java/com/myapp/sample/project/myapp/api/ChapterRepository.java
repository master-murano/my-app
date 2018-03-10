package com.myapp.sample.project.myapp.api;

import com.myapp.sample.project.myapp.model.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository  extends ReactiveCrudRepository<Chapter, String>{
}
