# Multi-Connector Microservices with gRPC, SOAP, GraphQL, and REST

This project demonstrates the implementation of gRPC and multi-connector microservices using SOAP, REST, GraphQL, and gRPC. It includes both basic gRPC communication models and a distributed system integrating multiple web service technologies.

## Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Part 1: gRPC Implementation](#part-1-grpc-implementation)
   - [Unary Model](#unary-model)
   - [Server Streaming Model](#server-streaming-model)
   - [Client Streaming Model](#client-streaming-model)
   - [Bidirectional Streaming Model](#bidirectional-streaming-model)
4. [Part 2: Multi-Connector Microservices](#part-2-multi-connector-microservices)
   - [Customer Service](#customer-service)
   - [Account Service](#account-service)
   - [Integration with REST, GraphQL, SOAP, and gRPC](#integration-with-rest-graphql-soap-and-grpc)
5. [Testing](#testing)
6. [Conclusion](#conclusion)

## Introduction

The project is divided into two main parts:
1. **gRPC Implementation:** Demonstrates the four basic gRPC communication models.
2. **Multi-Connector Microservices:** Creates a distributed system with customer and account services connected using REST, GraphQL, SOAP, and gRPC.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- Protocol Buffers Compiler (protoc)
- Spring Boot
- gRPC Java library
- GraphQL Java library
- SOAP library (JAX-WS)

## Part 1: gRPC Implementation

### Unary Model

Unary RPCs are the simplest type of RPC. The client sends a single request and receives a single response.

### Server Streaming Model

The server streaming RPC allows the server to send multiple responses to a single client request.

### Client Streaming Model

Client streaming RPC allows the client to send a stream of requests to the server and receive a single response.

### Bidirectional Streaming Model

Bidirectional streaming RPC allows both the client and server to send a stream of messages to each other.

## Part 2: Multi-Connector Microservices

### Customer Service

The customer service manages customer information and is implemented with the following technologies:
- **REST API:** Using Spring Boot.
- **GraphQL API:** Using Spring Boot GraphQL.
- **SOAP API:** Using JAX-WS.
- **gRPC API:** Using gRPC Java.

### Account Service

The account service manages account information and is implemented with the following technologies:
- **REST API:** Using Spring Boot.
- **GraphQL API:** Using Spring Boot GraphQL.
- **SOAP API:** Using JAX-WS.
- **gRPC API:** Using gRPC Java.

### Integration with REST, GraphQL, SOAP, and gRPC


## Testing

- **gRPC Testing:** Use `grpcurl` or a gRPC client library.
- **REST API Testing:** Use Postman or curl.
- **GraphQL Testing:** Use GraphQL Playground or Postman.
- **SOAP Testing:** Use SOAP-UI or Postman.

## Conclusion

This project demonstrates a comprehensive approach to implementing and integrating various web service technologies, showcasing the versatility and interoperability of modern microservice architectures.

For further exploration, consider adding security layers, load balancing, or deploying the services on a Kubernetes cluster for better scalability and management.