package com.sofkau.todo.todoapp.service;

import com.sofkau.todo.todoapp.dto.TagDto;

public interface TagService {

    TagDto createTag(TagDto tagDto);
    void deleteTag(Long id);

}
