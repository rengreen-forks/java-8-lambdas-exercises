package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.music.Artist;

import java.util.stream.Stream;

// BEGIN body
/** A Performance by some musicians - e.g., an Album or Gig. */
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

}
// END body
