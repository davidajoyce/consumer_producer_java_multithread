# consumer_producer_java_multithread
This is a java script to solve the consumer-producer problem, multi-process synchronisation problem

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

## Installing

This java script was developed using the Eclipse Platform version 3.8.1


## Running the program:

Run the program from the Eclipse GUI.

## The Consumer Producer problem

The probelm describes two processes, the producer and consumer, which share a common fixed-size buffer (in this case a linked list) as a queue

The producer's job is to generate data, but it into the shared buffer and start again.

At the same time, the consumer is consuming the data, i.e taking it from the buffer, one piece at a time.

## The Consumer Producer solution

The producer is to either go to sleep or discard data if the buffer is full. The next time the consumer removes an item from the buffer, it notifies the producer, who starts to fill the buffer again. 

In the same way, the consumer can go to sleep if it finds the buffer to be empty. The next time the producer puts data into the buffer, it wakes up the sleeping consumer.

An inadequate solution could result in a deadlock where both processes are waiting to be awakened.

## Expected Result

The expected result is as follows:

```
The Producer produced-0
The Producer produced-1
The Consumer consumed-0
The Consumer consumed-1
The Producer produced-2
The Producer produced-3
The Consumer consumed-2

```

