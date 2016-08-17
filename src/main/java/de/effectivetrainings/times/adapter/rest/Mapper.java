package de.effectivetrainings.times.adapter.rest;

public interface Mapper<FROM, TO> {

    public FROM from(TO to);

    public TO to(FROM from);
}
