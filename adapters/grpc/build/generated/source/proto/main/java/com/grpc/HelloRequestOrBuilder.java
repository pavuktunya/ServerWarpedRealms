// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GreetingService.proto

// Protobuf Java Version: 4.26.1
package com.grpc;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.HelloRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string token = 1;</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 1;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * map&lt;string, string&gt; bagOfTricks=6;
   * </pre>
   *
   * <code>.com.grpc.InputMessage message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * map&lt;string, string&gt; bagOfTricks=6;
   * </pre>
   *
   * <code>.com.grpc.InputMessage message = 2;</code>
   * @return The message.
   */
  com.grpc.InputMessage getMessage();
  /**
   * <pre>
   * map&lt;string, string&gt; bagOfTricks=6;
   * </pre>
   *
   * <code>.com.grpc.InputMessage message = 2;</code>
   */
  com.grpc.InputMessageOrBuilder getMessageOrBuilder();
}