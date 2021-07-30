package com.alibaba.ocean.rawsdk.client;

import java.io.Serializable;

public class APIId implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 3310099984731564724L;

    public static final int DEFAULT_VERSION = 1;

    private String namespace;

    private String name;

    private int version;

    public APIId() {
        super();
    }

    public APIId(String namespace, String name) {
        this(namespace, name, DEFAULT_VERSION);
    }

    public APIId(String namespace, String name, int version) {
        this.namespace = namespace;
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(namespace).append(':').append(name).append('-').append(version).toString();
    }

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }
}
