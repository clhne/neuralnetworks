package com.github.neuralnetworks.training;

import org.uncommons.maths.random.MersenneTwisterRNG;

/**
 *
 * Mersenne twister random initializer
 *
 */
public class MersenneTwisterRandomInitializer extends RandomInitializerImpl {

	public MersenneTwisterRandomInitializer() {
		super(new MersenneTwisterRNG());
	}

	public MersenneTwisterRandomInitializer(float max) {
		super(new MersenneTwisterRNG(), max);
	}
}