package com.premonition.todo.app.domain.task.commands;

import lombok.Value;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

@Value
public class StarTaskCommand {

	@TargetAggregateIdentifier
	private final String id;
}
