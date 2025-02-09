package org.virtuslab.yaml.internal.load.reader

private final case class ReaderStack(var stack: List[ReaderState]):

  def push(state: ReaderState): Unit =
    stack = state :: stack

  def peek(): Option[ReaderState] = stack.headOption

  def pop(): Option[ReaderState] =
    stack.headOption match
      case Some(v) =>
        stack = stack.tail
        Some(v)
      case _ => None
