package com.github.neuralnetworks.samples.mnist;

import com.github.neuralnetworks.architecture.Matrix;
import com.github.neuralnetworks.input.InputConverter;

public class MnistTargetSingleNeuronOutputConverter implements InputConverter {

    @Override
    public Matrix convert(Object[] input) {
	Matrix m = new Matrix(1, input.length);

	for (int i = 0; i < input.length; i++) {
	    m.set(0, i, (int) input[i]);
	}

	return m;
    }
}
