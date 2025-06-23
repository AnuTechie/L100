package singletonPattern.generator.impl;

import singletonPattern.generator.interfaces.IdGenerator;

import java.util.concurrent.atomic.AtomicLong;

public final class SimpleIdGenerator implements IdGenerator {

    private final AtomicLong counter =
            new AtomicLong(System.currentTimeMillis() / 1000);

    @Override
    public String nextId() {
        return "ID-" + counter.getAndIncrement();
    }
}
