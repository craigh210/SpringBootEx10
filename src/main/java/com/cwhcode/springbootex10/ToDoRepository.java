package com.cwhcode.springbootex10;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Item, Long> {
}
