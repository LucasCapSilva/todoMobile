package com.generation.todo.repository;

import org.springframework.stereotype.Repository;

import com.generation.todo.model.Tarefa;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TarefaRepository extends JpaRepository <Tarefa, Long> {

}
