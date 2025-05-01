package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class NumericIncrementTransformOperation implements TransformOperation {
    private x operand;

    public NumericIncrementTransformOperation(x xVar) {
        Assert.hardAssert(Values.isNumber(xVar), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.operand = xVar;
    }

    private double operandAsDouble() {
        if (Values.isDouble(this.operand)) {
            return this.operand.x();
        }
        if (Values.isInteger(this.operand)) {
            return (double) this.operand.z();
        }
        throw Assert.fail("Expected 'operand' to be of Number type, but was " + this.operand.getClass().getCanonicalName(), new Object[0]);
    }

    private long operandAsLong() {
        if (Values.isDouble(this.operand)) {
            return (long) this.operand.x();
        }
        if (Values.isInteger(this.operand)) {
            return this.operand.z();
        }
        throw Assert.fail("Expected 'operand' to be of Number type, but was " + this.operand.getClass().getCanonicalName(), new Object[0]);
    }

    private long safeIncrement(long j10, long j11) {
        long j12 = j10 + j11;
        return ((j10 ^ j12) & (j11 ^ j12)) >= 0 ? j12 : j12 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    public x applyToLocalView(x xVar, Timestamp timestamp) {
        double x10;
        x.b i10;
        x computeBaseValue = computeBaseValue(xVar);
        if (!Values.isInteger(computeBaseValue) || !Values.isInteger(this.operand)) {
            if (Values.isInteger(computeBaseValue)) {
                x10 = (double) computeBaseValue.z();
            } else {
                Assert.hardAssert(Values.isDouble(computeBaseValue), "Expected NumberValue to be of type DoubleValue, but was ", xVar.getClass().getCanonicalName());
                x10 = computeBaseValue.x();
            }
            i10 = x.F().i(x10 + operandAsDouble());
        } else {
            i10 = x.F().k(safeIncrement(computeBaseValue.z(), operandAsLong()));
        }
        return (x) i10.build();
    }

    public x applyToRemoteDocument(x xVar, x xVar2) {
        return xVar2;
    }

    public x computeBaseValue(x xVar) {
        return Values.isNumber(xVar) ? xVar : (x) x.F().k(0).build();
    }

    public x getOperand() {
        return this.operand;
    }
}
