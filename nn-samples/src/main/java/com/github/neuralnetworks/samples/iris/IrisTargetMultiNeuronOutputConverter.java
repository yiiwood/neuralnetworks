package com.github.neuralnetworks.samples.iris;

import com.github.neuralnetworks.architecture.Matrix;
import com.github.neuralnetworks.input.InputConverter;
import com.github.neuralnetworks.util.Util;

public class IrisTargetMultiNeuronOutputConverter implements InputConverter {

    private Matrix convertedTarget;

    @Override
    public Matrix convert(Object[] input) {
	if (convertedTarget == null || convertedTarget.getColumns() != input.length) {
	    convertedTarget = new Matrix(3, input.length);
	} else {
	    Util.fillArray(convertedTarget.getElements(), 0);
	}

	for (int i = 0; i < input.length; i++) {
	    int val = (int) input[i];
	    convertedTarget.set(val, i, 1);
	}

	return convertedTarget;
    }
}
