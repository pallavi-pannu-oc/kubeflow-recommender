package com.lightbend.recommender.client

import org.apache.kafka.clients.consumer.ConsumerRecord

trait RecordProcessorTrait[K, V] {

  def processRecord(record: ConsumerRecord[K, V]): Unit
}
