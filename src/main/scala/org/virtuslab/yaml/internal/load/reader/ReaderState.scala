package org.virtuslab.yaml.internal.load.reader

sealed trait ReaderState
case object ReaderState:
  case object Stream                     extends ReaderState
  case object Document                   extends ReaderState
  final case class Mapping(indent: Int)  extends ReaderState
  final case class Sequence(indent: Int) extends ReaderState
  case object FlowMapping                extends ReaderState
  case object FlowSequence               extends ReaderState
