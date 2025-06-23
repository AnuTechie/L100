package singletonPattern.generator;

import singletonPattern.generator.impl.SimpleIdGenerator;
import singletonPattern.generator.interfaces.IdGenerator;

public final class UniqueIdService {

    private static volatile UniqueIdService instance;

    private final IdGenerator generator;

    private UniqueIdService(IdGenerator generator) {
        this.generator = generator;
    }

    public static UniqueIdService getInstance() {
        if (instance == null) {
            synchronized (UniqueIdService.class) {
                if (instance == null) {
                    instance = new UniqueIdService(new SimpleIdGenerator());
                }
            }
        }
        return instance;
    }

    public String nextId() {
        return generator.nextId();
    }
}
