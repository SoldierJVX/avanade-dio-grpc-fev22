// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.avanade.grpc.product.lib;

public final class ProductProto {
  private ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_avanade_grpc_ProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_avanade_grpc_ProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_avanade_grpc_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_avanade_grpc_ProductResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022\020com.avanade.grpc\"1\n\016Pro" +
      "ductRequest\022\n\n\002id\030\001 \001(\t\022\023\n\013description\030\002" +
      " \001(\t\"2\n\017ProductResponse\022\n\n\002id\030\001 \001(\t\022\023\n\013d" +
      "escription\030\002 \001(\t2n\n\016ProductService\022\\\n\025Pr" +
      "oductsByDescription\022 .com.avanade.grpc.P" +
      "roductRequest\032!.com.avanade.grpc.Product" +
      "ResponseB.\n\034com.avanade.grpc.product.lib" +
      "B\014ProductProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_avanade_grpc_ProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_avanade_grpc_ProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_avanade_grpc_ProductRequest_descriptor,
        new java.lang.String[] { "Id", "Description", });
    internal_static_com_avanade_grpc_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_avanade_grpc_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_avanade_grpc_ProductResponse_descriptor,
        new java.lang.String[] { "Id", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}